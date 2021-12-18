package com.cui.part3.prototype;

import com.cui.part3.prototype.framework.Manager;
import com.cui.part3.prototype.framework.Product;

public class Main {

    private static final String STRONG_MESSAGE = "strong message";
    private static final String WARNING_BOX = "warning box";
    private static final String SLASH_BOX = "slash box";
    private static final String HELLO_WORLD = "Hello, world.";

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.register(STRONG_MESSAGE, new UnderlinePen('~'));
        manager.register(WARNING_BOX, new MessageBox('*'));
        manager.register(SLASH_BOX, new MessageBox('/'));

        Product p1 = manager.create(STRONG_MESSAGE);
        Product p2 = manager.create(WARNING_BOX);
        Product p3 = manager.create(SLASH_BOX);

        p1.use(HELLO_WORLD);
        p2.use(HELLO_WORLD);
        p3.use(HELLO_WORLD);
    }
}
