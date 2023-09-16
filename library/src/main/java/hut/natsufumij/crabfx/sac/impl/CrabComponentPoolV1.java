package hut.natsufumij.crabfx.sac.impl;

import hut.natsufumij.crabfx.sac.CrabComponentPool;
import hut.natsufumij.crabfx.sac.CrabComponentSystem;
import javafx.beans.property.ReadOnlySetProperty;

/**
 * @author NatsufumiJ
 * @description
 * @date 23:33 2023/9/15
 * @since
 */
public class CrabComponentPoolV1 implements CrabComponentPool {
    @Override
    public ReadOnlySetProperty<String> supportSystem() {
        return null;
    }

    @Override
    public void addComponentSystem(CrabComponentSystem system) {
    }
}
