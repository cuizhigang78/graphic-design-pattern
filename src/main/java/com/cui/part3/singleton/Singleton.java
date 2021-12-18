package com.cui.part3.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    /**
     * private禁止从Singleton类外部调用构造函数
     */
    private Singleton() {
        System.out.println("生成了一个实例。");
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
