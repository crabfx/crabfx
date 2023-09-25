package hut.natsufumij.crabfx.engine.sac;

// 一个场景
public interface CrabScene {

    // 场景id
    String id();

    // 获取场景根节点
    Actor root();
}
