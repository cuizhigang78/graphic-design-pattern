package com.cui.part3.prototype;

import com.cui.part3.prototype.framework.Product;
/**
 * ConcretePrototype（具体的原型）
 *
 * ConcretePrototype 角色负责实现复制现在实例并生成新实例的方法。
 */
public class UnderlinePen extends Product {
    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.println("");
        for (int i = 0; i < length + 2; i++) {
            System.out.print(ulChar);
        }
        System.out.println("");
    }
}
