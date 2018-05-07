/**
 * Adapter模式说明:
 * 使用现有功能填补新需求的一种实现方式
 *
 * Adapter的实现方式有两种
 * 1.继承的适配器
 * 2.委托的适配器
 *
 * Adapter模式中出现的角色
 * 1.Banner类,表示原有的功能
 * 2.Print接口,新的需求
 * 3.PrintBanner类,适配器
 *
 * 这里只是实现了继承的方式,委托的模式是在PrintBanner类中定义一个Banner的对象,
 * 使用banner对象的方法调用来完成新的实现
 * 注:菜鸟教程的实现方式更容易理解,也更说明问题
 *
 *
 *
 * @Author xdc90
 * @Date 2018/5/7
 */
package com.dawn.adapter;