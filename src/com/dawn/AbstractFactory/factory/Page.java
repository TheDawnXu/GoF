package com.dawn.AbstractFactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * 作为工厂的产品
 *
 * @Author xdc90
 * @Date 2018/5/18
 */
public abstract class Page {

    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<Item>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        content.add(item);
    }

    public abstract String makeHTML();

    public void output(){
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + "编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
