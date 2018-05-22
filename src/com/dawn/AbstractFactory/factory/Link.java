package com.dawn.AbstractFactory.factory;

/**
 * 表示HTML链接
 *
 * @Author xdc90
 * @Date 2018/5/18
 */
public abstract class Link extends Item{
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
