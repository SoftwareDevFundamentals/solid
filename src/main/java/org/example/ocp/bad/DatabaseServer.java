package org.example.ocp.bad;

public class DatabaseServer {

    private String username;
    private String password;
    private String host;
    private String port;
    private String database;

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(final String port) {
        this.port = port;
    }

    public String getDatabaseName() {
        return database;
    }

    public void setDatabase(final String database) {
        this.database = database;
    }
}
