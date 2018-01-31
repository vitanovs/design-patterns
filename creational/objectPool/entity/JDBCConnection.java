package creational.objectPool.entity;

/**
 * Dummy JDBC Connection - for the sake of the task, I am simulating
 * an expensive to build class.
 */
public class JDBCConnection {

    private static final long TIME_ALIVE = 10000000000L;

    private String driver;
    private String serverType;
    private String host;
    private int port;
    private String databaseName;
    private boolean createIfNotExists;

    public static class Builder {
        private String driver;
        private String serverType;
        private String host;
        private int port;
        private String databaseName;
        private boolean createIfNotExists;
        private long timeAlive;

        public Builder setDriver(String driver) {
            this.driver = driver;
            return this;
        }

        public Builder setServerType(String type) {
            this.serverType = type;
            return this;
        }

        public Builder setHost(String host) {
            this.host = host;
            return this;
        }

        public Builder setPort(int port) {
            this.port = port;
            return this;
        }

        public Builder setDatabaseName(String name) {
            this.databaseName = name;
            return this;
        }

        public Builder createIfNotExists(boolean create) {
            this.createIfNotExists = create;
            return this;
        }

        public JDBCConnection build() {
            return new JDBCConnection(this);
        }
    }

    private JDBCConnection(Builder builder) {
        this.driver = builder.driver;
        this.serverType = builder.serverType;
        this.host = builder.host;
        this.port = builder.port;
        this.databaseName = builder.databaseName;
        this.createIfNotExists = builder.createIfNotExists;
    }

    public String getDriver() {
        return driver;
    }

    public String getServerType() {
        return serverType;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public boolean isCreateIfNotExists() {
        return createIfNotExists;
    }

    public long getTimeAlive() {
        return TIME_ALIVE;
    }

    @Override
    public String toString() {
        String url = String.format("%s:%s//%s:%d/%s",
                this.driver,
                this.serverType,
                this.host,
                this.port,
                this.databaseName);
        if (this.createIfNotExists) {
            url += "?createIfNotExists=true";
        }
        return url;
    }
}
