package com.cui.part7.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 根据邮件地址编写该用户的Web页面
 */
public class PageMaker {
    /**
     * 防止外部 new 出 PageMaker 实例，所以声明为 private
     */
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailAddress, String filename) {
        try {
            Properties mailProp = Database.getProperties("maildata");
            String username = mailProp.getProperty(mailAddress);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("welcome to " + username + "'s page ! ");
            writer.paragraph("欢迎来到" + username + "的主页。");
            writer.paragraph("等着你的邮件哦! ");
            writer.mailto(mailAddress, username);
            writer.close();
            System.out.println(filename + " is created for " + mailAddress + "(" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}