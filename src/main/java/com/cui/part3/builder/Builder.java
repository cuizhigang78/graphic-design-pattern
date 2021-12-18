package com.cui.part3.builder;

/**
 * 声明了编写文档的方法的抽象类
 *
 * Builder （建造者）
 *
 * Builder 角色负责定义用于生成实例的接口（API）。其中准备了用于生成实例的方法。
 */
public abstract class Builder {
    /**
     * 编写标题
     * @param title
     */
    public abstract void makeTitle(String title);

    /**
     * 编写字符串
     * @param str
     */
    public abstract void makeString(String str);

    /**
     * 编写条目
     * @param items
     */
    public abstract void makeItems(String[] items);

    /**
     * 完成文档编写
     */
    public abstract void close();
}
