package com.dawn.factory;

/**
 * @Author xdc90
 * @Date 2018/5/9
 */
public class IDCardFactory extends Factory{

    @Override
    Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    void registerProduct(Product product) {
        System.out.println("注册了身份证");
    }

}
