package com.aitool.infrast.artifact.feign.logger;

import com.alibaba.fastjson.JSON;
import feign.Logger;
import feign.Request;
import feign.Response;
import feign.Util;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;

import java.io.IOException;

import static feign.Util.UTF_8;
import static feign.Util.decodeOrDefault;

@Slf4j
public class CustomizedFeignLogger extends Logger {
    public static final String MDC_KEY = "_OPENFEIGN_TRACE_ID_";

    @Override
    protected void log(String configKey, String format, Object... args) {
        log.info(String.format(methodTag(configKey) + format, args));
    }

    @Override
    protected void logRequest(String configKey, Level logLevel, Request request) {
        MDC.put(MDC_KEY, String.valueOf(System.currentTimeMillis()));
        String bodyText = request.charset() != null ? new String(request.body(), request.charset()) : null;
        log(configKey, "%s Request Url : %s", MDC.get(MDC_KEY), request.url());
        log(configKey, "%s Request Method : %s", MDC.get(MDC_KEY), request.httpMethod());
        log(configKey, "%s Request Header : %s", MDC.get(MDC_KEY), JSON.toJSONString(request.headers()));
        log(configKey, "%s Request Body : %s", MDC.get(MDC_KEY), bodyText == null ? "Binary Data" : bodyText);
    }

    @Override
    protected Response logAndRebufferResponse(String configKey, Level logLevel, Response response, long elapsedTime)
        throws IOException {
        int status = response.status();
        log(configKey, "%s Response Status : %s", MDC.get(MDC_KEY), JSON.toJSONString(response.status()));
        log(configKey, "%s Response Header : %s", MDC.get(MDC_KEY), JSON.toJSONString(response.headers()));
        if (response.body() != null && !(status == 204 || status == 205)) {
            byte[] bodyData = Util.toByteArray(response.body().asInputStream());
            log(configKey, "%s Response Body : %s", MDC.get(MDC_KEY),
                decodeOrDefault(bodyData, response.charset() != null ? response.charset() : UTF_8, "Binary data"));
            return response.toBuilder().body(bodyData).build();
        }
        return response;
    }

    @Override
    protected IOException logIOException(String configKey, Level logLevel, IOException ioe, long elapsedTime) {
        log(configKey, "%s IOException Message : %s", MDC.get(MDC_KEY), ioe.getMessage());
        return ioe;
    }
}
