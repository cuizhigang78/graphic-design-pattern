package com.cui.part4.strategy;

import java.security.SecureRandom;

/**
 * 表示“如果这局猜拳获胜，那么下一局也出一样的手势”这一策略的类
 */
public class WinningStrategy implements Strategy {

    private SecureRandom random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy() {
        this.random = new SecureRandom();
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
