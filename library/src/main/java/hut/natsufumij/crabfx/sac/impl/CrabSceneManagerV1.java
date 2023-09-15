package hut.natsufumij.crabfx.sac.impl;

import hut.natsufumij.crabfx.sac.CrabScene;
import hut.natsufumij.crabfx.sac.CrabSceneLoader;
import hut.natsufumij.crabfx.sac.CrabSceneManager;

/**
 * @author NatsufumiJ
 * @description
 * @date 23:31 2023/9/15
 * @since
 */
public class CrabSceneManagerV1 implements CrabSceneManager {
    @Override
    public CrabScene now() {
        return null;
    }

    @Override
    public CrabScene prepare(String id) {
        return null;
    }

    @Override
    public void store() {

    }

    @Override
    public void push(CrabScene scene) {

    }

    @Override
    public void set(CrabScene scene) {

    }

    @Override
    public void pop() {

    }

    @Override
    public CrabSceneManager waitPush(CrabScene waitScene, CrabScene nextScene, CrabSceneLoader loader) {
        return null;
    }
}
