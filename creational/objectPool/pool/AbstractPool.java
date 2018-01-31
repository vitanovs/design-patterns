package creational.objectPool.pool;

import java.util.*;

public abstract class AbstractPool<T> implements Pool<T> {

    private Map<T, Long> locked;
    private Map<T, Long> unlocked;

    protected AbstractPool() {
        locked = new HashMap<>();
        unlocked = new HashMap<>();
    }

    @Override
    public T takeOut() {
        if (unlocked.size() == 0) {
            unlocked.put(create(), System.currentTimeMillis());
        }

        long currentMilliseconds = System.currentTimeMillis();
        T res;

        for (T t : unlocked.keySet()) {
            res = t;
            if (currentMilliseconds - unlocked.get(t) > timeAlive(t)) {
                unlocked.remove(t);
                t = null;
            } else {
                if (validate(t)) {
                    unlocked.remove(t);
                    locked.put(t, System.currentTimeMillis());
                    return t;
                } else {
                    unlocked.remove(t);
                    t = null;
                }
            }
        }

        T entity = unlocked.keySet().iterator().next();
        unlocked.remove(entity);
        locked.put(entity, System.currentTimeMillis());
        return entity;
    }

    @Override
    public boolean release(T entity) {
        if (locked.containsKey(entity)) {
            locked.remove(entity);
            unlocked.put(entity, System.currentTimeMillis());
            return true;
        }
        return false;
    }
}
