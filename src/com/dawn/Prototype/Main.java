package com.dawn.Prototype;

/**
 * @Author xdc90
 * @Date 2018/5/16
 */
public class Main {

    public static void main(String[] args) {
        Manager m = new Manager();
        UnderlinePen ulp = new UnderlinePen('*');
        MessageBox mb = new MessageBox('%');
        m.register("p", mb);
        m.register("s", ulp);

        Product p1 = m.create("p");
        p1.use("测试1");

        Product p2 = m.create("s");
        p2.use("测试2");

    }
}
