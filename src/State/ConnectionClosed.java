package State;

public class ConnectionClosed extends ConnectionState {
    @Override
    public void open(Connection connection) {
        System.out.println("\nOpening the connection ...");
        connection.setState(connection.getConnectionOpened());
    }

    @Override
    public void close(Connection connection) {
        System.out.println("\nException : The connection is already closed");

    }

    @Override
    public void test(Connection connection) {
        System.out.println("\n=> The connection is closed");
    }
}
