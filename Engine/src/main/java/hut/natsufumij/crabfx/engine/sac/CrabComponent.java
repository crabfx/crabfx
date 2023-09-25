package hut.natsufumij.crabfx.engine.sac;

public abstract class CrabComponent {

    // 组件id，每个实体的组件不允许有相同的id
    private final String id;
    // 该组件的拥有者
    private final Actor owner;
    // 该组件是否需要调用自己的update方法
    private final boolean needUpdate;

    protected CrabComponent(String id, Actor owner, boolean needUpdate) {
        this.id = id;
        this.owner=owner;
        this.needUpdate = needUpdate;
    }

    // 获取组件id，该id在实体内部是唯一的
    public final String getId() {
        return id;
    }

    // 获取组件的所有者Actor
    public final Actor getOwner() {
        return owner;
    }

    // 通知所有者移除自己这个组件
    public final void removeSelf(){
        owner.removeComponent(id);
    }

    // 判断组件是否需要调用update
    public final boolean isNeedUpdate() {
        return needUpdate;
    }

    // 场景各个实体和组件创建完毕，准备就绪
    protected void ready(){
    }

    // 组件需要被唤醒
    protected void awake(){
    }

    // 组件需要更新
    protected void update(double delta){
    }

    // 组件将要被销毁
    protected void dead(){
    }
}
