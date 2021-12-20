package com.cui.part6.chain_of_responsibility;

/**
 * 用来解决问题的具体类（仅解决奇数编号的问题）
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 == 1;
    }
}
