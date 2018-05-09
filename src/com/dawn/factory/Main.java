package com.dawn.factory;

/**
 * @Author xdc90
 * @Date 2018/5/9
 */
public class Main {

    public static void main(String[] args) {
        Factory f = new IDCardFactory();
        Product p1 = f.create("小明");
        Product p2 = f.create("小红");
        p1.user();
        p2.user();
    }
}
