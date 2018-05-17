package com.dawn.builder;

/**
 * @Author xdc90
 * @Date 2018/5/17
 */
public interface Builder {

    void makeTitle(String title);

    void makeString(String s);

    void makeItem(String[] items);

    void close();
}
