package com.dawn.factory;

/**
 * @Author xdc90
 * @Date 2018/5/9
 */
public abstract class Factory {

    abstract Product createProduct(String owner);

    abstract void registerProduct(Product product);

    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
}
