package org.example.ocp.correct;

public class MySqlUrlConnection implements IConnectableUrl {

    @Override
    public String getConnectionURL(DatabaseServer databaseServer) {
        return String.format("jdbc:mysql://%s:%s@%s:%s/%s",
                databaseServer.getUsername(),
                databaseServer.getPassword(),
                databaseServer.getHost(),
                databaseServer.getPort(),
                databaseServer.getDatabaseName());
    }
}
