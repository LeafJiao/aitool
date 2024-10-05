package com.aitool.artifact.boot.base.service.api;

import com.aitool.artifact.boot.base.resource.entity.User;
import com.aitool.artifact.boot.base.service.wrapper.UserWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author JiaoWei
* @description 针对表【user】的数据库操作Service
* @createDate 2024-10-05 13:58:06
*/
public interface UserService extends IService<User> {
    List<UserWrapper> getUser();
}
