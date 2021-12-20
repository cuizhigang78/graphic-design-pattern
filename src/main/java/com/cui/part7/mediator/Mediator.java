package com.cui.part7.mediator;

/**
 * 定义“仲裁者”的接口
 */
public interface Mediator {
    /**
     * 生成 Mediator 要管理的组员
     */
    public abstract void createColleagues();

    /**
     * 被各个组员调用，向仲裁者进行报告
     */
    public abstract void colleagueChanged();
}
