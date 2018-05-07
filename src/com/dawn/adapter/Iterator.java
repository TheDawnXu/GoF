package com.dawn.adapter;

/**
 * @Author xdc90
 * @Date 2018/5/7
 */
public interface Iterator {

    /**
     * 判断是否有下一个对象
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个对象
     * @return
     */
    Object next();
}
