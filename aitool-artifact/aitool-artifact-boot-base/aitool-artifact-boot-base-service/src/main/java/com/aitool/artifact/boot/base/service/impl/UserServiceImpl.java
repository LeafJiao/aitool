package com.aitool.artifact.boot.base.service.impl;

import com.aitool.artifact.boot.base.service.api.UserService;
import com.aitool.artifact.boot.base.service.converter.UserConverter;
import com.aitool.artifact.boot.base.service.wrapper.UserWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aitool.artifact.boot.base.resource.entity.User;
import com.aitool.artifact.boot.base.resource.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author JiaoWei
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-10-05 13:58:06
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserConverter userConverter;

    @Override
    public List<UserWrapper> getUser() {
        List<User> users = userMapper.selectList(null);
        List<UserWrapper> userWrappers = userConverter.toWrappers(users);
        return userWrappers;
    }
}




