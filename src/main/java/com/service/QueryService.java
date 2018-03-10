package com.service;

import java.util.List;

public interface QueryService<T> {
    /**
     *
     * @param c
     * @return T
     * ͨ�������ѯ��ϸ��Ϣ
     */
   T query(T c);

    /**
     *
     * @param id
     * @return T
     * ͨ��id��ѯʵ����Ϣ
     */
   T queryById(Integer id);

    /**
     *
     * @return List<T>
     *  ��ѯ������Ϣ
     */
   List<T> queryAll();
}
