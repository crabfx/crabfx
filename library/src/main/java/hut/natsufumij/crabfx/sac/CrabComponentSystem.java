package hut.natsufumij.crabfx.sac;

import java.util.List;

/**
 * @author NatsufumiJ
 * @description 表示一个组件的系统
 */
public interface CrabComponentSystem {

    //组件id
    String id();

    //为实体生成一个组件
    CrabComponent create(CrabActor actor);

    //是否需要单一一帧的处理
    boolean needProcess();

    //单一一帧，所有的同一组件的处理
    void process(List<CrabComponent> allComps);

    //处理优先级
    int priority();
}
