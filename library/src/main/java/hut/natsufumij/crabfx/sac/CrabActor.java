/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hut.natsufumij.crabfx.sac;

import javafx.beans.property.ReadOnlyListProperty;
import javafx.beans.property.ReadOnlySetProperty;

/**
 * 表演者节点接口，提供一般父子的节点属性访问和组件访问
 * @author Administrator
 */
public interface CrabActor {

    //节点id
    String id();

    //节点标签
    ReadOnlySetProperty<String> tags();

    //添加一个标签
    void addTag(String oneTag);

    //移除一个标签
    void removeTag(String tag);

    //获取父节点
    CrabActor parent();

    //获取全部的直接子节点
    ReadOnlyListProperty<CrabActor> children();

    //根据路径获取子节点
    CrabActor findChildByPath(String path);

    //生成一个节点
    CrabActor createActor(String id);

    //添加一个子节点，注：该子节点必须没有父节点
    boolean addChild(CrabActor actor);

    //根据节点id移除子节点
    boolean removeChild(String id);

    //获取全部的组件id,无法做新增、删除操作
    ReadOnlySetProperty<String> components();

    //根据组件id获取指定组件
    CrabComponent component(String id);

    //创建一个组件，如果不存在该组件生成器，则应该返回null
    CrabComponent createComponent(String id);

    //移除指定组件，如果移除失败，应该返回false
    boolean removeComponent(String id);
}