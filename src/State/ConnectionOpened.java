package State;

public class ConnectionOpened extends ConnectionState {
    @Override
    public void open(Connection connection) {
        System.out.println("\nException :The connection is already opened");
    }

    @Override
    public void close(Connection connection) {
        System.out.println("\nClosing the connection ...");
        connection.setState(connection.getConnectionClosed());
    }

    @Override
    public void test(Connection connection) {
        System.out.println("\nEstablishing the connection ...");
        connection.setState(connection.getConnectionEstablished());
    }
}
