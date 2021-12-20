package com.cui.part4.bridge;

/**
 * Bridge 模式：将类的功能层次结构与实现层次结构分离
 *
 * 类的功能层次结构：父类具有基本功能，在子类中增加新的功能
 *
 * 类的实现层次结构：父类通过声明抽象方法来定义接口，子类通过实现具体方法来实现接口
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
