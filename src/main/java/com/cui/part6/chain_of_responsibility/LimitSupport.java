package com.cui.part6.chain_of_responsibility;

/**
 * 用来解决问题的具体类（仅解决编号小于指定编号的问题）
 */
public class LimitSupport extends Support {
    /**
     * 可以解决编号小于 limit 的问题
     */
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
