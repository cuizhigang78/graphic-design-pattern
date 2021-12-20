package com.cui.part6.visitor;

/**
 * 表示数据结构的接口，它接受访问者的访问
 *
 */
public interface Element {
    public abstract void accept(Visitor v);
}
