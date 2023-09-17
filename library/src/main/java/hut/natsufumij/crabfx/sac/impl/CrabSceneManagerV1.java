package hut.natsufumij.crabfx.sac.impl;

import hut.natsufumij.crabfx.sac.*;
import javafx.beans.property.*;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author NatsufumiJ
 * @description
 * @date 23:31 2023/9/15
 * @since
 */
public class CrabSceneManagerV1 implements CrabSceneManager {

    protected static final Map<String,CrabComponentSystem> CRAB_SYSTEMS = new ConcurrentHashMap<>();

    private static class CrabActorV1 implements CrabActor{
        private String id;
        private SetProperty<String> tags;
        private Optional<CrabActor> parentOpt;
        private SetProperty<CrabComponent> components;
        private SetProperty<String> componentIds;
        private ListProperty<CrabActor> children;

        @Override
        public String id() {
            return id;
        }

        @Override
        public ReadOnlySetProperty<String> tags() {
            return tags;
        }

        @Override
        public void addTag(String oneTag) {
            tags.add(oneTag);
        }

        @Override
        public void removeTag(String tag) {
            tags.remove(tag);
        }

        @Override
        public Optional<CrabActor> parent() {
            return parentOpt;
        }

        @Override
        public ReadOnlyListProperty<CrabActor> children() {
            return children;
        }

        @Override
        public Optional<CrabActor> findChildByPath(String path) {
            return Optional.empty();
        }

        @Override
        public Optional<CrabActor> createChild(String id) {
            return Optional.empty();
        }

        @Override
        public boolean addChild(CrabActor actor) {
            return false;
        }

        @Override
        public boolean removeChild(String id) {
            if(children.stream().anyMatch(e->e.id().equals(id))){
                children.removeIf(e->e.id().equals(id));
                return true;
            }
            return false;
        }

        @Override
        public ReadOnlySetProperty<String> components() {
            return componentIds;
        }

        @Override
        public Optional<CrabComponent> component(String id) {
            return components.stream().filter(e->e.id().equals(id)).findAny();
        }

        @Override
        public Optional<CrabComponent> createComponent(String id) {
            if(componentIds.contains(id))return components.stream().filter(e->e.id().equals(id)).findFirst();
            //If Support
            if(CRAB_SYSTEMS.containsKey(id)){
                CrabComponent component=CRAB_SYSTEMS.get(id).create(this);
                components.add(component);
                componentIds.add(id);
                return Optional.of(component);
            }
            return Optional.empty();
        }

        @Override
        public boolean removeComponent(String id) {
            if(componentIds.contains(id)){
                components.removeIf(e->e.id().equals(id));
                componentIds.remove(id);
                return true;
            }
            return false;
        }
    }

    private static class CrabSceneV1 implements CrabScene {
        private final CrabActor root;
        private final String id;
        private final DoubleProperty loadRate;

        public CrabSceneV1(CrabActor root, String id) {
            this.root = root;
            this.id = id;
            loadRate = new SimpleDoubleProperty(0.0);
        }

        @Override
        public CrabActor root() {
            return root;
        }

        @Override
        public String id() {
            return id;
        }

        @Override
        public ReadOnlyDoubleProperty loadRate() {
            return loadRate;
        }
    }


    private CrabScene nowScene;

    @Override
    public CrabScene now() {
        return nowScene;
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

    @Override
    public CrabComponentPool pool() {
        return null;
    }
}
