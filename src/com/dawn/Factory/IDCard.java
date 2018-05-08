package com.dawn.Factory;

/**
 * @Author xdc90
 * @Date 2018/5/9
 */
public class IDCard implements Product {

    private String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void user() {
        System.out.println("使用"+owner+"的身份证");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
