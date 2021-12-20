package com.cui.part5.composite;

/**
 * 抽象类，用来实现 File 类和 Directory 类的一致性
 */
public abstract class Entry {
    /**
     * 获取名字
     * @return
     */
    public abstract String getName();

    /**
     * 获取大小
     * @return
     */
    public abstract int getSize();

    /**
     * 加入目录条目
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    /**
     * 显示目录条目一览
     */
    public void printList() {
        printList("");
    }

    /**
     * 为一览加上前缀并显示目录条目一览
     * @param prefix
     */
    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
