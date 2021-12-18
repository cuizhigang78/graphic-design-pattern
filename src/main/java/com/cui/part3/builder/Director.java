package com.cui.part3.builder;

/**
 * 使用 Builder 类中声明的方法来编写文档
 *
 * Director （监工）
 *
 * Director 角色负责使用 Builder 角色的接口（API）来生成实例。它并不依赖 ConcreteBuilder 角色。
 * 为了确保不论 ConcreteBuilder 角色是如何被定义的，Director 角色都能正常工作，它只调用在 Builder 角色中被定义的方法。
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 编写文档
     */
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上至下午");
        builder.makeItems(new String[] {
                "早上好。",
                "下午好。"
        });
        builder.makeString("晚上");
        builder.makeItems(new String[] {
                "晚上好。",
                "晚安。",
                "再见。"
        });
        builder.close();
    }
}
