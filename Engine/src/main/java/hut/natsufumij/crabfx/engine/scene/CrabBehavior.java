package hut.natsufumij.crabfx.engine.scene;

/**
 * 实体行为为实体某个特别功能的展现，一个实体行为有如下特点：
 * <ol>
 *     <li>每个行为有被唤醒、睡眠的行为回调，会在实体指定组件行为调用的时候被调用</li>
 *     <li>每个行为有单独的是否被唤醒的判定，但实体如果睡眠了，组件无论是否被唤醒均无法更新其任何状态</li>
 *     <li>每个行为智能专属于某个实体，不能互相转让</li>
 * </ol>
 *
 * @see CrabActor
 */
public abstract class CrabBehavior {

    public CrabBehavior(CrabActor actor) {
        this(actor, true);
    }

    public CrabBehavior(CrabActor actor, boolean needUpdate) {
        this.actor = actor;
        this.needUpdate = needUpdate;
        this.isSleep = true;
    }

    /**
     * 此行为所属的实体，不能修改
     */
    protected final CrabActor actor;

    /**
     * 此行为是否需要遍历调用其更新函数
     */
    protected final boolean needUpdate;

    /**
     * 此行为是否已经陷入睡眠状态
     */
    protected boolean isSleep;

    /**
     * 获取所属的实体
     */
    public CrabActor getActor() {
        return actor;
    }

    /**
     * 是否需要更新组件
     */
    public boolean isNeedUpdate() {
        return needUpdate;
    }

    /**
     * 是否已经处于睡眠状态
     */
    public boolean isSleep() {
        return isSleep;
    }

    /**
     * 通知组件苏醒
     */
    public final boolean awake() {
        if (isSleep) {
            isSleep = false;
            awakeCall();
            return true;
        }
        return false;
    }

    /**
     * 通知组件陷入睡眠
     */
    public final boolean sleep(){
        if (!isSleep) {
            isSleep = true;
            sleepCall();
            return true;
        }
        return false;
    }

    /**
     * 更新该行为内部状态时的回调，倘若被调用，因在构造函数里将needUpdate的入参置为true
     *
     * @param delta 与上一帧之间的间隔时间，单位秒
     */
    protected void updateCall(double delta) {
    }

    /**
     * 行为准备好，并且实体环境已经准备好了，此时实体的所有组件都已经被加入，但是组件的初始化顺序不一定严格按照组件在实体中的顺序，在整个环境只被调用一次
     */
    protected void startCall() {
    }

    /**
     * 将要睡眠时的回调，默认为空，组件可自行覆写以实现自定义行为
     */
    protected void sleepCall() {
    }

    /**
     * 从睡眠中被唤醒时的回调，默认为空，组件可自行覆写以实现自定义行为
     */
    protected void awakeCall() {
    }

    /**
     * 组件将要被销毁时的回调，默认为空，组件可自行覆写以实现自定义行为
     */
    protected void destroyCall() {
    }
}
