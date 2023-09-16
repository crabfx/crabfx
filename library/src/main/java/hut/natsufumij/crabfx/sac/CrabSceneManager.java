package hut.natsufumij.crabfx.sac;

import hut.natsufumij.crabfx.sac.impl.CrabSceneManagerV1;

/**
 * 场景管理器，使用状态机来管理各个场景之间的关系
 *
 * @author Administrator
 */
public interface CrabSceneManager {

    //单例
    CrabSceneManager manager = new CrabSceneManagerV1();

    //获取当前的场景
    CrabScene now();

    //准备一个场景，id应当为场景配置文件路径
    //解析场景需要的资源素材，等待进入新场景时加载
    CrabScene prepare(String id);

    //存储当前场景配置信息，包括所有实体直接需要的资源，各种实体的默认值配置
    void store();

    //进入新场景，当前场景会进入场景栈
    void push(CrabScene scene);

    //用新场景替代当前场景
    void set(CrabScene scene);

    //移除当前场景，回退上一个场景
    void pop();

    //进入等待场景等待下一个场景加载完毕后，进入下一个场景
    //场景加载，加载必要的资源素材
    CrabSceneManager waitPush(CrabScene waitScene,CrabScene nextScene,CrabSceneLoader loader);

    //获取组件系统管理池
    CrabComponentPool pool();
}
