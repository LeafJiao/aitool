package com.aitool.infrast.artifact.feign.config;

import com.aitool.infrast.artifact.feign.logger.CustomizedFeignLogger;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalFeignConfiguration {

    @Bean
    public Logger feignLogger() {
        return new CustomizedFeignLogger();
    }
}
