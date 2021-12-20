package com.cui.part3.abstract_foctory.factory;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 表示的是一个含有多个 Link 类和 Tray 类的容器。
 *
 */
public abstract class Tray extends Item {

    protected ArrayList<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
