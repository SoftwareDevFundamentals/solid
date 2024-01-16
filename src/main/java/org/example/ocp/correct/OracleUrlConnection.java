package org.example.ocp.correct;

public class OracleUrlConnection implements IConnectableUrl {
    @Override
    public String getConnectionURL(DatabaseServer databaseServer) {
        return String.format("jdbc:oracle:thin:%s/%s@%s:%s:%s",
                databaseServer.getUsername(),
                databaseServer.getPassword(),
                databaseServer.getHost(),
                databaseServer.getPort(),
                databaseServer.getDatabaseName());
    }
}
