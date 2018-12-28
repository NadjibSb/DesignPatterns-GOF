package State;

public class ConnectionEstablished extends ConnectionState {
    @Override
    public void open(Connection connection) {
        System.out.println("\nThe connection is already opened");
    }

    @Override
    public void close(Connection connection) {
        System.out.println("\nClosing the connection ...");
        connection.setState(connection.getConnectionClosed());
    }

    @Override
    public void test(Connection connection) {
        System.out.println("\n=> The connection is Established");
    }
}
