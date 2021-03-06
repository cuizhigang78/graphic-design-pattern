package com.cui.part3.abstract_foctory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 抽象地表示 HTML 页面的类。
 */
public abstract class Page {
    /**
     * 标题
     */
    protected String title;
    /**
     * 作者
     */
    protected String author;
    /**
     * 页面内容
     */
    protected ArrayList<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        String filename = title + ".html";
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + " 编写完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
