package hut.natsufumij.crabfx.engine.sac;


import java.util.Optional;
import java.util.Set;

/**
 *
 * @author natsufumij
 */
public interface Actor {

    // 实体id
    String id();

    // 所有的组件
    Set<String> allComponents();

    // 创建并附着一个组件
    CrabComponent createComponent(String componentName);

    // 移除一个组件
    void removeComponent(String componentName);

    // 所有的直接子节点
    Set<Actor> children();

    // 查找子节点，从路径中寻找
    Actor findChild(String path);

    // 添加子节点
    void addChild(Actor actor);

    // 移除子节点
    void removeChild(String id);

    // 移除自己
    void removeSelf();

    // 父节点
    Optional<Actor> parent();
}
