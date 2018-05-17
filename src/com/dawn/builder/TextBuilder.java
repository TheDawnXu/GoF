package com.dawn.builder;

/**
 * @Author xdc90
 * @Date 2018/5/17
 */
public class TextBuilder implements Builder {
    @Override
    public void makeTitle(String title) {
        System.out.println(title);
    }

    @Override
    public void makeString(String s) {
        System.out.println(s);
    }

    @Override
    public void makeItem(String[] items) {
        for (String s : items) System.out.println(s);
    }

    @Override
    public void close() {
        System.out.println("-------END-------");
    }
}
