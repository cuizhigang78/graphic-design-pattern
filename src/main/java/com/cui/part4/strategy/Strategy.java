package com.cui.part4.strategy;

/**
 * 表示猜拳游戏中的策略的类
 *
 * Strategy （策略）
 *
 * Strategy 角色负责决定实现策略所必需的接口。
 */
public interface Strategy {
    /**
     * 获取下一局要出的手势
     * @return
     */
    public abstract Hand nextHand();

    /**
     * 学习“上一局的手势是否获胜了”
     * @param win
     */
    public abstract void study(boolean win);
}
