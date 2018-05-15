package com.dawn.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xdc90
 * @Date 2018/5/15
 */
public class Manager {

    private Map<String, Product> showCase = new HashMap<String, Product>();

    public void register(String s, Product p){
        showCase.put(s, p);
    }

    public Product create(String s){
        return showCase.get(s);
    }
}
