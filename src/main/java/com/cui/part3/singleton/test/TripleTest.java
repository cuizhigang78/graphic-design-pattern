package com.cui.part3.singleton.test;

public class TripleTest {

    public static void main(String[] args) {
        Triple instance1 = Triple.getInstance(0);
        Triple instance2 = Triple.getInstance(1);
        System.out.println(instance1 == instance2);
    }
}
