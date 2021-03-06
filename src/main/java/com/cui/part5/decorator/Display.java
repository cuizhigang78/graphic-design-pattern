package com.cui.part5.decorator;

/**
 * 用于显示字符串的抽象类
 *
 * Component
 *
 * 增加功能时的核心角色。
 */
public abstract class Display {
    /**
     * 获取横向字符数
     * @return
     */
    public abstract int getColumns();

    /**
     * 获取纵向行数
     * @return
     */
    public abstract int getRows();

    /**
     * 获取第 row 行的字符串
     * @param row
     * @return
     */
    public abstract String getRowText(int row);

    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
