package com.cui.part3.abstract_foctory.factory;

/**
 * Item 类是 Link 类和 Tray 类的父类，这样他们就具有可替换性了。
 *
 */
public abstract class Item {
    /**
     * 标题
     */
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
