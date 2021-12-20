package com.cui.part6.chain_of_responsibility;

/**
 * 用来解决问题的具体类（仅解决指定编号的问题）
 */
public class SpecialSupport extends Support {
    /**
     * 只能解决编号等于 number 的问题
     */
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == number;
    }
}
