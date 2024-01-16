package org.example.ocp.bad;

public class ConnectionURLBuilder {

    public String getConnectionURL(final DatabaseServer databaseServer, final DatabaseType databaseType) {
        if (DatabaseType.ORACLE.equals(databaseType)) {
            return String.format("jdbc:oracle:thin:%s/%s@%s:%s:%s",
                    databaseServer.getUsername(),
                    databaseServer.getPassword(),
                    databaseServer.getHost(),
                    databaseServer.getPort(),
                    databaseServer.getDatabaseName());
        } else if (DatabaseType.MYSQL.equals(databaseType)) {
            return String.format("jdbc:mysql://%s:%s@%s:%s/%s",
                    databaseServer.getUsername(),
                    databaseServer.getPassword(),
                    databaseServer.getHost(),
                    databaseServer.getPort(),
                    databaseServer.getDatabaseName());
        } else if (DatabaseType.SQL_SERVER.equals(databaseType)) {
            return String.format("jdbc:sqlserver://%s:%s;databaseName=%s;user=%s;password=%s",
                    databaseServer.getHost(),
                    databaseServer.getPort(),
                    databaseServer.getDatabaseName(),
                    databaseServer.getUsername(),
                    databaseServer.getPassword());
        }
        throw new IllegalArgumentException("Database Server not supported.");
    }
}
