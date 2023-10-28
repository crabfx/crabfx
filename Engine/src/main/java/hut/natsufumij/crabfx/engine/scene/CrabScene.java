package hut.natsufumij.crabfx.engine.scene;

/**
 * 场景为表示管理节点集合的一个管理系统。场景有如下特定：
 * <ol>
 *     <li>场景表示一个单个游戏场景，比如开始游戏场景和游戏场景</li>
 *     <li>每个场景都存在一个唯一的ID、该ID在场景切换时需要指定</li>
 * </ol>
 *
 * @see CrabActor
 */
public interface CrabScene {

    /**
     * 该场景的ID、每个场景的场景ID必须唯一,该ID应当在生成的时候指定
     *
     * @return 场景的ID
     */
    String sceneID();

    /**
     * 每个场景都拥有一个根节点，这个根节点无法被移除，一切的场景节点操作在该节点的子节点中完成
     * @see CrabActor
     * @return 场景所拥有的根节点实体
     */
    CrabActor rootActor();
}
