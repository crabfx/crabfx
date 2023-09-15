/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hut.natsufumij.crabfx.sac;

import javafx.beans.property.ReadOnlyDoubleProperty;

/**
 * 一个场景，供玩家操纵来实现游戏世界中的内容,是一个承装实体的大容器。
 * 当一个场景创建完成，他拥有一个无法删除的根节点，任何对于场景内容的修改，都应该在该节点上操作。
 * 
 * @author Administrator
 */
public interface CrabScene {

    //提供根节点
    CrabActor root();

    //生成一个节点
    CrabActor create(String id);
    
    //提供场景id
    String id();

    //加载率
    ReadOnlyDoubleProperty loadRate();
}
