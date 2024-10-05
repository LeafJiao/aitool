package com.aitool.artifact.boot.base.service.wrapper;

import lombok.Data;

/**
 * @author jiaowei
 * @since 2024/10/5 11:45
 */
@Data
public class UserWrapper {
    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户名
     */
    private String username;

    /**
     * 头像
     */
    private String avatar;
}
