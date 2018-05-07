package com.dawn.adapter;

/**
 * @Author xdc90
 * @Date 2018/5/7
 */
public class Banner {
    private String str;

    public Banner(String str) {
        this.str = str;
    }

    public void showWithParen(){
        System.out.println("("+str+")");
    }

    public void showWithAster(){
        System.out.println("*"+str+"*");
    }
}
