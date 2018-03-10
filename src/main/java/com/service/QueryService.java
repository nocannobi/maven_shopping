package com.service;

import java.util.List;

public interface QueryService<T> {
    /**
     *
     * @param c
     * @return T
     * 通过对象查询详细信息
     */
   T query(T c);

    /**
     *
     * @param id
     * @return T
     * 通过id查询实体信息
     */
   T queryById(Integer id);

    /**
     *
     * @return List<T>
     *  查询所有信息
     */
   List<T> queryAll();
}
