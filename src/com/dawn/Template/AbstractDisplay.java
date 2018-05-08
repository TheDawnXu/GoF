package com.dawn.Template;

/**
 * @Author xdc90
 * @Date 2018/5/8
 */
public abstract class AbstractDisplay {

    abstract void start();

    abstract void deal();

    abstract void end();

    public final void template(){
        this.start();
        for (int i = 0; i < 5; i++) {
            this.deal();
        }
        this.end();
    }


}
