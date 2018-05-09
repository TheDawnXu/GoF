package com.dawn.template;

/**
 * @Author xdc90
 * @Date 2018/5/8
 */
public class StringDisplay extends AbstractDisplay {
    @Override
    void start() {
        System.out.println("---start---");
    }

    @Override
    void deal() {
        System.out.println("***deal***");
    }

    @Override
    void end() {
        System.out.println("---end---");
    }
}
