package com.dawn.CallBack;

public class Main {
    public static void main(String[] args) {
        ProgramB b = new ProgramB();
        PragramA a = new PragramA(b);

        a.doEvent("完成一个表格");
    }
}
