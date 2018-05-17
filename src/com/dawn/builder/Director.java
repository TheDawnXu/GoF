package com.dawn.builder;

/**
 * @Author xdc90
 * @Date 2018/5/17
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.makeTitle("标题");

        builder.makeString("这是介绍");

        builder.makeItem(new String[]{"这是第一条", "这是第二条"});

        builder.close();
    }
}
