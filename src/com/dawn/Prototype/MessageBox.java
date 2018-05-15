package com.dawn.Prototype;

/**
 * @Author xdc90
 * @Date 2018/5/15
 */
public class MessageBox implements Product{
    private char c;

    public MessageBox(char c) {
        this.c = c;
    }

    @Override
    public void use(String s) {
        System.out.println(c + " " + s + " " + c);
    }

    @Override
    public Product createClone() {
        try {
            return (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("复制类失败:" + e.getMessage());
        }
        return null;
    }
}
