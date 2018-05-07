/**
 * Iterator 模式说明
 * 模式功能说明,Iterator模式用于遍历数组元素的功能
 *
 * 模式中类的功能说明
 * Aggregate: 表示集合的接口
 * Iterator: 表示遍历的接口
 * Book: 表示书的类
 * BookShelf: 表示书架的类
 * BookShekfIterator: 遍历书架的类
 * Main: 测试
 *
 * 迭代器模式的产生主要为了解决集合本身和迭代行为耦合的问题,
 * 可以在不暴露集合内部的情况下,遍历集合
 *
 * 示例代码说明:编辑书架中的图书,书架代表需要遍历的集合
 *
 * @Author xdc90
 * @Date 2018/5/7
 */
package com.dawn.iterator;