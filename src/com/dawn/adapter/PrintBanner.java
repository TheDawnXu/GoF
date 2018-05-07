package com.dawn.adapter;

/**
 * @Author xdc90
 * @Date 2018/5/7
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        super.showWithParen();
    }

    @Override
    public void printStrong() {
        super.showWithAster();
    }
}
