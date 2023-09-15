/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hut.natsufumij.crabfx.sac;

import hut.natsufumij.crabfx.sac.impl.CrabComponentPoolV1;

/**
 * 表示一个实体的行为，可以用作各种各样的事情
 *
 * @author Administrator
 */
public abstract class CrabComponent {

    //组件支持系统
    public static final CrabComponentPool system = new CrabComponentPoolV1();

    //组件id
    private final String id;
    //所属实体
    private final CrabActor owner;

    public CrabComponent(String id, CrabActor owner) {
        this.id = id;
        this.owner = owner;
    }

    //组件id
    public final String id() {
        return id;
    }

    //所属实体
    public final CrabActor owner() {
        return owner;
    }

    //场景加载结束,所属实体所有组件准备完成
    protected void ready() {
    }

    //将被从所属实体中移除
    protected void remove() {
    }

    //每一帧都会调用的更新，单位秒
    protected void update(double delta) {
    }
}
