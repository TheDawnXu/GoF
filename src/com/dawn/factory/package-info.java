/**
 * Factory模式
 * 在Factory模式中应用了Template模式,有固定流程来生成实体,工厂模式中父类决定了生成实体的方式,
 * 但是生成具体的处理交给子类
 *
 * Factory模式下的成员类说明
 * Product:定义产品共有方法的接口
 * factory:抽象类,实现了create方法(即Template模式中的流程方法)
 * IDCard:实现Product接口
 * IDCardFactory:继承了Factory类
 * Main:测试类
 *
 * @Author xdc90
 * @Date 2018/5/9
 */
package com.dawn.factory;