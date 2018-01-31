package creational.objectPool.pool;


import creational.objectPool.entity.JDBCConnection;

public class JDBCConnectionPool extends AbstractPool<JDBCConnection> {

    @Override
    public JDBCConnection create() {
        return new JDBCConnection.Builder()
                .setDriver("jdbc")
                .setServerType("mysql")
                .setHost("localhost")
                .setPort(8000)
                .setDatabaseName("example_database")
                .createIfNotExists(true)
                .build();
    }

    @Override
    public long timeAlive(JDBCConnection connection) {
        return connection.getTimeAlive();
    }

    @Override
    public boolean validate(JDBCConnection connection) {
        return connection.getTimeAlive() < System.currentTimeMillis();
    }
}
