/**
 * Singleton模式
 * 想确保任何情况下都只有1个实例
 *
 * 成员类:
 * Singleton:只存在一个实例的类
 * Main:测试类
 *
 * 重点: Singleton的类的构造器是私有的,避免从Singleton外部调用构造函数
 * 生成新的实例
 *
 * 1.类的加载过程?
 * 在Singleton类中,singleton是一个静态变量,当类第一次被使用的时候,
 * 该变量被初始化,以后使用的时候不再重复初始化,实例中的单例实现模式借用了这一特点
 * 2.多线程情况下使用该模式如何确保只生成一个实例?
 *
 *
 * @Author xdc90
 * @Date 2018/5/10
 */
package com.dawn.singleton;