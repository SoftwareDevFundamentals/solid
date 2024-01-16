package org.example.ocp.correct;

public class SqlServerUrlConnection implements IConnectableUrl {

    @Override
    public String getConnectionURL(DatabaseServer databaseServer) {
        return String.format("jdbc:sqlserver://%s:%s;databaseName=%s;user=%s;password=%s",
                databaseServer.getHost(),
                databaseServer.getPort(),
                databaseServer.getDatabaseName(),
                databaseServer.getUsername(),
                databaseServer.getPassword());
    }
}
