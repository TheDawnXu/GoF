package com.dawn.Prototype;

/**
 * @Author xdc90
 * @Date 2018/5/15
 */
public interface Product extends Cloneable {

    void use(String s);

    Product createClone();
}
