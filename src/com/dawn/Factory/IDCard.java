package com.dawn.Factory;

/**
 * 注意这个类的构造器并不是public的
 * 因为默认的修饰符使得包外部的类无法通过new 的方式来生成该实体
 * 只能通过工厂类来实现
 *
 * @Author xdc90
 * @Date 2018/5/9
 */
public class IDCard implements Product {

    private String owner;

    IDCard(String owner) {
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
