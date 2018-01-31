package creational.objectPool;

import creational.objectPool.entity.JDBCConnection;
import creational.objectPool.pool.JDBCConnectionPool;
import creational.objectPool.pool.Pool;

public class ObjectPoolDesignPattern {
    public static void main(String[] args) {

        Pool<JDBCConnection> pool = new JDBCConnectionPool();

        for(int i = 0; i < 10; i++){
            JDBCConnection jdbcConnection = pool.takeOut();
            System.out.println(jdbcConnection);
            pool.release(jdbcConnection);
        }

        System.out.println();
    }
}
