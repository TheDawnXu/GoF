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
 * 演示的程序比较简单,可能不能说明原型模式的用处,故有此说明:
 * 示例程序中,我们把一些准备好的商品的原型注册到Manager对象中,
 * 在此想要获取该类型对象的时候直接从manager对象中获取,通过源码我们知道,
 * 每次调用create方法都会为我们clone一个新的对象,供使用,
 * 假设创建该对象的方法很复杂,那么使用该模式可以简化每次创建对象的过程
 *
 * TODO Cloneable接口和clone方法的拓展内容
 * 1.clone方法的复制是浅复制,要是深复制需要用Serializable序列化的方式复制
 * 2.
 *
 * @Author xdc90
 * @Date 2018/5/15
 */
package com.dawn.Prototype;