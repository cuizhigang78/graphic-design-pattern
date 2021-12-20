package com.cui.part4.strategy;

import java.security.SecureRandom;

/**
 * 表示“根据上一局的手势从概率上计算出下一局的手势从之前的猜拳结果讲下下一局出各种拳的概率”这一策略的类
 *
 * ConcreteStrategy 具体的策略
 *
 * ConcreteStrategy 角色负责实现 Strategy 角色的接口，即负责实现具体的策略。
 *
 */
public class ProbStrategy implements Strategy {
    private SecureRandom random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;
    private int[][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
    };

    public ProbStrategy() {
        this.random = new SecureRandom();
    }

    @Override
    public Hand nextHand() {
       int bet = random.nextInt(getSum(currentHandValue));
       int handValue = 0;
       if (bet < history[currentHandValue][0]) {
           handValue = 0;
       } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
           handValue = 1;
       } else {
           handValue = 2;
       }
       prevHandValue = currentHandValue;
       currentHandValue = handValue;
       return Hand.getHand(handValue);
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }

    private int getSum(int hv) {
        int sum = 0;
        for (int i = 0; i < history.length; i++) {
            sum += history[hv][i];
        }
        return sum;
    }
}
