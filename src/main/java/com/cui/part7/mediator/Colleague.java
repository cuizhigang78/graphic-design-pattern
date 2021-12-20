package com.cui.part7.mediator;

/**
 * 定义“组员”的接口
 */
public interface Colleague {
    /**
     * 告知组员“我是仲裁者，有事报告我”
     * @param mediator
     */
    public abstract void setMediator(Mediator mediator);

    /**
     * 告知组员仲裁者所下达的指示 true启用/false禁用
     * @param enable
     */
    public abstract void setColleagueEnable(boolean enable);
}
