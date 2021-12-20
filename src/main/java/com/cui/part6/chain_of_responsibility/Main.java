package com.cui.part6.chain_of_responsibility;

/**
 * Chain of Responsibility模式的最大优点就在于它弱化了发出请求的人( Client角色)和处理请求的人(ConcreteHandler角色)之间的关系。
 * Client 角色向第一个ConcreteHandler角色发出请求，然后请求会在职责链中传播，直到某个ConcreteHandler角色处理该请求。
 *
 * 如果不使用该模式，就必须有某个伟大的角色知道“谁应该处理什么请求”，这有点类似中央集权制。
 * 而让“发出请求的人”知道“谁应该处理该请求”并不明智，因为如果发出请求的人不得不知道处理请求的人各自的责任分担情况，
 * 就会降低其作为可复用的组件的独立性。
 */
public class Main {
    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);
        // 形成职责链
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        // 制造各种问题
        for (int i = 0; i < 500; i += 33) {
            alice.support(new Trouble(i));
        }
    }
}
