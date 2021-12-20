package com.cui.part3.abstract_foctory.factory;

/**
 * Link 类抽象地表示 HTML 的超链接
 */
public abstract class Link extends Item {
    /**
     * 超链接所指向的地址
     */
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
