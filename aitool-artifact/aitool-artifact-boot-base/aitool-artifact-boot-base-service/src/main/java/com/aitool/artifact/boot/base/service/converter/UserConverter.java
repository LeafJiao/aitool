package com.aitool.artifact.boot.base.service.converter;

import com.aitool.artifact.boot.base.resource.entity.User;
import com.aitool.artifact.boot.base.service.wrapper.UserWrapper;
import com.aitool.infrast.artifact.resource.Converter;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * @author jiaowei
 * @since 2024/10/5 14:14
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserConverter extends Converter<User, UserWrapper> {
}
