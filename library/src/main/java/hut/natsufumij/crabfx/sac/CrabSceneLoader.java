package hut.natsufumij.crabfx.sac;

import javafx.beans.value.WritableDoubleValue;

/**
 * 场景自定义导入加载率回调器
 *
 * @author Administrator
 */
public interface CrabSceneLoader {

    /**
     * 导入场景
     * @param scene 导入的场景
     * @param rate 导入比率
     */
    void load(CrabScene scene,WritableDoubleValue rate);
}
