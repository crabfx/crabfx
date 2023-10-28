package hut.natsufumij.crabfx.engine.scene;

/**
 * 一个实体表示可以操作的一个节点及其行为的集合体。一个实体有以下定义：
 * <ol>
 *     <li>每个实体都可以拥有复数个不同类型的表现行为，但同一种表现行为不允许重复被添加</li>
 *     <li>每个实体都可以拥有自己的子节点，父节点必须为一个，不允许有循环父子依赖</li>
 * </ol>
 *
 * @see CrabScene
 * @see CrabBehavior
 */
public interface CrabActor {


}
