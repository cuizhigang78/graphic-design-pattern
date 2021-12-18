package com.cui.part3.prototype;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MessageBoxTest {

    MessageBox messageBox;

    @Before
    public void before() {
        messageBox = new MessageBox('*');
    }

    @Test
    public void use() {
        messageBox.use("Hello");
    }
}