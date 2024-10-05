package com.aitool.artifact.boot.base.http;

import com.aitool.artifact.boot.base.service.api.UserService;
import com.aitool.artifact.boot.base.service.wrapper.UserWrapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jiaowei
 * @since 2024/10/5 13:56
 */
@RestController
@RequestMapping("/base/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/list")
    public List<UserWrapper> getUser() {
        List<UserWrapper> users = userService.getUser();
        return users;
    }
}
