package com.cui.part3.builder;

/**
 * Builder 的子类，使用纯文本编写文档，并以String返回结果。
 *
 * ConcreteBuilder （具体的建造者）
 *
 * ConcreteBuilder 角色是负责实现 Builder 角色的接口的类（API）。这里定义了在生成实例时实际被调用的方法。
 * 此外，在 ConcreteBuilder 角色中还定义了获取最终生成结果的方法。
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("=====================\n")
                .append("[")
                .append(title).append("]\n")
                .append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('■')
                .append(str)
                .append("\n")
                .append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            buffer.append("  · ")
                    .append(item)
                    .append("\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("=====================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
