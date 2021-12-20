package com.cui.part7.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 表示登录对话框的类
 */
public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    //生成并配置各个colleague后，显示对话框
    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        //使用布局管理器生成4×2窗格
        setLayout(new GridLayout(4, 2));
        //生成各个colleague
        createColleagues();
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username: "));
        add(textUser);
        add(new Label("Password: "));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        //设置初始的启用/禁用状态
        colleagueChanged();
        //显示
        pack();
        show();
    }

    @Override
    public void createColleagues() {
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login ", g, false);
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");//设置Mediator
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);//设置Listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    /**
     * 接收来自于 Colleague 的通知然后判断 Colleague 的启用/禁用状态
     */
    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            textUser.setColleagueEnable(false);
            textPass.setColleagueEnable(false);
            buttonOk.setEnabled(true);
        } else {
            textUser.setColleagueEnable(true);
            userPassChanged();
        }
    }

    /**
     * 当 textUser 或 textPass 文本输入框中的文字发生变化时
     * 判断各 Colleague 的启用/禁用状态
     */
    private void userPassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.setColleagueEnable(true);
            if (textPass.getText().length() > 0) {
                buttonOk.setColleagueEnable(true);
            } else {
                buttonOk.setColleagueEnable(false);
            }
        } else {
            textPass.setColleagueEnable(false);
            buttonOk.setColleagueEnable(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
