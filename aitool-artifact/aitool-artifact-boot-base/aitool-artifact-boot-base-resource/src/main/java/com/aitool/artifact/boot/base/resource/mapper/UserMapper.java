package com.aitool.artifact.boot.base.resource.mapper;

import com.aitool.artifact.boot.base.resource.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author JiaoWei
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-10-05 13:58:06
* @Entity com.aitool.artifact.boot.base.mapper.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




