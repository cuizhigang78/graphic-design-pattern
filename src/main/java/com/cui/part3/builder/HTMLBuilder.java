package com.cui.part3.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * HTMLBuilder 类也是 Builder 的子类，它的功能是使用 HTML 编写文档，并返回结果是HTML文件的名称
 *
 * ConcreteBuilder （具体的建造者）
 *
 * ConcreteBuilder 角色是负责实现 Builder 角色的接口的类（API）。这里定义了在生成实例时实际被调用的方法。
 * 此外，在 ConcreteBuilder 角色中还定义了获取最终生成结果的方法。
 */
public class HTMLBuilder extends Builder {
    private String filename;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (String item : items) {
            writer.println("<li>" + item + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
