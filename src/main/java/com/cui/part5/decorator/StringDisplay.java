package com.cui.part5.decorator;

/**
 * 用于显示单行字符串的类
 *
 * ConcreteComponent
 *
 * 实现了 Component 角色所定义的接口
 */
public class StringDisplay extends Display {
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        return row == 0 ? string : null;
    }
}
