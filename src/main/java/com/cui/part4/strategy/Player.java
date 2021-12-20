package com.cui.part4.strategy;

/**
 * 表示进行猜拳游戏的选手的类
 *
 * Context （上下文） 负责使用 Strategy 角色。
 *
 * Context 角色保存了 ConcreteStrategy 角色的实例，并使用 ConcreteStrategy 角色
 */
public class Player {

    private String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even() {
        gameCount++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strategy=" + strategy +
                ", winCount=" + winCount +
                ", loseCount=" + loseCount +
                ", gameCount=" + gameCount +
                '}';
    }
}
