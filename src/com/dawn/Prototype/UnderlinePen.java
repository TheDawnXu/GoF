package com.dawn.Prototype;

/**
 * @Author xdc90
 * @Date 2018/5/16
 */
public class UnderlinePen implements Product {
    private char c;

    public UnderlinePen(char c) {
        this.c = c;
    }

    @Override
    public void use(String s) {
        System.out.println(c + " " + s + " " +c);
    }

    @Override
    public Product createClone() {
        try {
            return (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
