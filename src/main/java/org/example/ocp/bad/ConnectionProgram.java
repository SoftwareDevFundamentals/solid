package org.example.ocp.bad;

public final class ConnectionProgram {

    private ConnectionProgram() {
        // Default constructor.
    }

    public static void main(final String[] args) {
        // Instantiate database server data.
        DatabaseServer serverData = new DatabaseServer();

        // Instantiate connection url builder.
        ConnectionURLBuilder urlBuilder = new ConnectionURLBuilder();

        // Gets connection URL according to database.
        String connectionURL = urlBuilder.getConnectionURL(serverData, DatabaseType.MYSQL);
//        String connectionURL = urlBuilder.getConnectionURL(serverData, DatabaseType.SQL_SERVER);
//        String connectionURL = urlBuilder.getConnectionURL(serverData, DatabaseType.ORACLE);

        // Rest of the logic to connect database.
        // ...
    }
}
