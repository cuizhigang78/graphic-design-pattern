package com.cui.part4.strategy;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Taro", new WinningStrategy());
        Player player2 = new Player("Hana", new ProbStrategy());

        for (int i = 0; i < 10000; i++) {
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();

            if (hand1.isStrongerThan(hand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (hand2.isStrongerThan(hand1)) {
                System.out.println("Winner: " + player2);
                player2.win();
                player1.lose();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
