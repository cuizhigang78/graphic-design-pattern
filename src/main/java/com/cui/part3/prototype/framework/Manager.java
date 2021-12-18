package com.cui.part3.prototype.framework;

import java.util.HashMap;

/**
 * Client （使用者）
 *
 * Client 角色负责使用复制实例的方法生成新的实例。
 */
public class Manager {
    private HashMap<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String name) {
        Product p = showcase.get(name);
        return p.createClone();
    }
}
