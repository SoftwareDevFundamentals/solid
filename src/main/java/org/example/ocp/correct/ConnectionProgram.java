package org.example.ocp.correct;

public final class ConnectionProgram {

    private ConnectionProgram() {
        // Default constructor.
    }

    public static void main(final String[] args) {
        DatabaseServer databaseServer = new DatabaseServer();

        IConnectableUrl urlConnection = new OracleUrlConnection();

        String url = urlConnection.getConnectionURL(databaseServer);
    }
}
