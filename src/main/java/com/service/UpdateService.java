package com.service;

public interface UpdateService<T> {
    /**
     *
     * @param t
     * @return boolean
     * ����ʵ��
     */
    boolean add(T t);

    /**
     *
     * @param t
     * @return boolean
     * ɾ��ʵ��
     */
    boolean del(T t);

    /**
     *
     * @param t
     * @return boolean
     * �޸�ʵ��
     */
    boolean update(T t);

}
