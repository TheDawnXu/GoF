/**
 * Builder模式说明
 * 用小的构建来组建大的构建就是builder模式,就像大楼需要一层一层的盖起来
 *
 * Builder模式中的成员类
 * Builder: 接口,提供构建文档的基本的方法
 * TextBuilder: 实现Builder接口,构建一种类型的文档
 * HtmlBUilder: 实现BUilder接口,构建另一种形式的文档
 * Director: director的实例需要依赖Builder对象来创建,然后整合builder里面的方法来输出文档
 * Main: 测试类
 *
 * @Author xdc90
 * @Date 2018/5/17
 */
package com.dawn.builder;