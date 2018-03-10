package com.service;

public interface UpdateService<T> {
    /**
     *
     * @param t
     * @return boolean
     * 增加实体
     */
    boolean add(T t);

    /**
     *
     * @param t
     * @return boolean
     * 删除实体
     */
    boolean del(T t);

    /**
     *
     * @param t
     * @return boolean
     * 修改实体
     */
    boolean update(T t);

}
