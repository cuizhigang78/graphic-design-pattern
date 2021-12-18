package com.cui.part3.prototype;

import com.cui.part3.prototype.framework.Product;

/**
 * ConcretePrototype（具体的原型）
 *
 * ConcretePrototype 角色负责实现复制现在实例并生成新实例的方法。
 */
public class MessageBox extends Product {
    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println("");
        System.out.println(decoChar + " " + s + " " + decoChar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println("");
    }
}
