package com.dawn.singleton;

/**
 * @Author xdc90
 * @Date 2018/5/14
 */
public class Main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1 == s2) {
            System.out.println("s1 和 s2 是同一个实例");
        }else{
            System.out.println("s1 和 s2 不是同一个实例");
        }
    }
}
