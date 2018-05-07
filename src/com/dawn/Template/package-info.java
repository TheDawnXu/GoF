/**
 * Template模式
 * 在父类中定义流程,在子类中定义具体的实现,
 * 无论子类中的实现是什么样子的,流程都会是父类中已经定义好的
 * 优势就是在父类流程中已经实现的方法不需要再每个子类中都实现一次
 *
 * Template模式中成员类说明
 * AbstractDisplay:(父类)定义了抽象方法,实现了模板方法,在模板方法中调用了抽象方法
 * StringDisplay:(子类之一)实现了父类中的抽象方法
 * Main:测试类
 *
 *
 * @Author xdc90
 * @Date 2018/5/8
 */
package com.dawn.Template;