package com.cui.part6.chain_of_responsibility;

/**
 * 用来解决问题的抽象类
 *
 * Handler （处理者）
 *
 * Handler 角色定义了处理请求的接口。Handler 知道“下一个处理者”是谁，如果自己无法处理请求，它会将请求转给“下一个处理者”。
 */
public abstract class Support {
    /**
     * 解决问题的实例的名称
     */
    private String name;
    /**
     * 要推掉给的对象
     */
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    /**
     * 解决问题的步骤
     * @param trouble
     */
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

    /**
     * 解决问题的方法
     * @param trouble
     * @return
     */
    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
