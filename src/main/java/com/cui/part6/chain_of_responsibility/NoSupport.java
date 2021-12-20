package com.cui.part6.chain_of_responsibility;

/**
 * 用来解决问题的具体类（永远“不处理问题”）
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    /**
     * 什么也不处理
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
