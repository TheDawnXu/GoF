package com.dawn.CallBack;

public class PragramA implements Callback {

    private ProgramB b;

    public PragramA(ProgramB b) {
        this.b = b;
    }

    public void doEvent(String event){
        new Thread(new Runnable() {
            @Override
            public void run() {
                b.doWork(PragramA.this, event);
            }
        }).start();
    }

    @Override
    public void event(String result) {
        System.out.println("程序猿b告诉程序猿a：" + result);
    }
}
