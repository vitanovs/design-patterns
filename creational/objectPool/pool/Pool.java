package creational.objectPool.pool;

public interface Pool<T> {

    T takeOut();

    boolean release(T entity);

    T create();

    long timeAlive(T entity);

    boolean validate(T entity);

}
