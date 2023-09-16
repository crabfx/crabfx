package hut.natsufumij.crabfx.sac;

import javafx.beans.property.ReadOnlySetProperty;

/**
 * @author NatsufumiJ
 * @description
 * @date 23:32 2023/9/15
 * @since
 */
public interface CrabComponentPool {

    //支持的组件系统id
    ReadOnlySetProperty<String> supportSystem();
    //添加组件系统支持
    void addComponentSystem(CrabComponentSystem system);
}
