package com.cui.part3.prototype.framework;

/**
 * Prototype（原型）。
 *
 * Product 角色负责定义用于复制现有实例来生成新实例的方法。
 */
public abstract class Product implements Cloneable {
    public abstract void use(String s);

    final Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
