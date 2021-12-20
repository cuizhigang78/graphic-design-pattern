package com.cui.part5.decorator;

/**
 * 用于显示装饰边框的抽象类
 *
 * Decorator （装饰物）
 *
 * 该角色具有 Component 角色相同的接口。在它内部保存了被装饰对象—— Component 角色。
 * Decorator 角色知道自己要装饰的对象。
 */
public abstract class Border extends Display {
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
