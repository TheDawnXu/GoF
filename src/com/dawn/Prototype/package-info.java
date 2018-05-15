/**
 * Prototype模式
 * 主要是使用clone方法和Cloneable接口来,通过复制创建新的实例
 * 使用场景:
 * 1.难以根据类来生成实例
 * 2.想解耦框架与生成的实例
 *
 * 实例程序成员说明:
 * Product:实现Cloneable接口的接口
 * Manager:通过Product的复制方法得到新的实例
 * MessageBox:实现Product接口的类
 * UnderlinePen:实现了Product接口的类
 * Main:测试类
 *
 * TODO
 * Cloneable接口和clone方法的拓展内容
 *
 * @Author xdc90
 * @Date 2018/5/15
 */
package com.dawn.Prototype;