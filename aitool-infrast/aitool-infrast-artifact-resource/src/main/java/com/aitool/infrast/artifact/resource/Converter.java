package com.aitool.infrast.artifact.resource;

import java.util.List;

public interface Converter<E, W> {
    /**
     * 数据库实体转数据传输对象
     *
     * @param entity
     * @return
     */
    W toWrapper(E entity);

    /**
     * 数据库实体转数据传输对象
     *
     * @param entities
     * @return
     */
    List<W> toWrappers(List<E> entities);

    /**
     * 数据传输对象转数据库实体
     *
     * @param wrapper
     * @return
     */
    E toEntity(W wrapper);

    /**
     * 数据传输对象转数据库实体
     *
     * @param wrappers
     * @return
     */
    List<E> toEntities(List<W> wrappers);
}
