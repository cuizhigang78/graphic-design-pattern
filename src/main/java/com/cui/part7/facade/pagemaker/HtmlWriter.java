package com.cui.part7.facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

/**
 * 编写HTML文件的类
 */
public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    /**
     * 输出标题
     *
     * @param title
     * @throws IOException
     */
    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body> \n");
        writer.write("<h1>" + title + "</h1>\n");
    }

    /**
     * 输出段落
     *
     * @param msg
     * @throws IOException
     */
    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>\n");
    }

    /**
     * 输出超链接
     *
     * @param href
     * @param caption
     * @throws IOException
     */
    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    /**
     * 输出邮件地址
     *
     * @param mailAddress
     * @throws IOException
     */
    public void mailto(String mailAddress, String username) throws IOException {
        link("mailto: " + mailAddress, username);
    }

    /**
     * 结束输出HTML
     *
     * @throws IOException
     */
    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
