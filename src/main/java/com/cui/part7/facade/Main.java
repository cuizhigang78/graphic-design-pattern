package com.cui.part7.facade;

import com.cui.part7.facade.pagemaker.PageMaker;

/**
 * Facade 模式（外观模式）可以让复杂的东西看起来简单。
 */
public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }
}
