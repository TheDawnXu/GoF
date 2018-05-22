package com.dawn.AbstractFactory.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示内容
 * @Author xdc90
 * @Date 2018/5/18
 */
public abstract class Tray extends Item{

    protected List<Item> trap = new ArrayList<Item>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item){
        trap.add(item);
    }
}
