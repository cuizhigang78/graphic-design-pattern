package com.cui.part3.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getSingleton();
        Singleton obj2 = Singleton.getSingleton();
        if (obj1 == obj2) {
            System.out.println("obj1和obj2是相同的实例。");
        } else {
            System.out.println("obj1和obj2是不同的实例。");
        }
        System.out.println("End.");
    }
}
