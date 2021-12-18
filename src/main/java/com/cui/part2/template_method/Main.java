package com.cui.part2.template_method;

import com.cui.part2.template_method.framework.Factory;
import com.cui.part2.template_method.framework.Product;
import com.cui.part2.template_method.idcard.IDCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("a");
        Product card2 = factory.create("b");
        Product card3 = factory.create("c");
        card1.use();
        card2.use();
        card3.use();
    }
}
