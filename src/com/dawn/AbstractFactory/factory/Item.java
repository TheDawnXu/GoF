package com.dawn.AbstractFactory.factory;

/**
 * @Author xdc90
 * @Date 2018/5/18
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String HTML();
}
