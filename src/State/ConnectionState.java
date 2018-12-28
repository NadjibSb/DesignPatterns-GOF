package State;

public abstract class ConnectionState {
    public abstract void open(Connection connection);
    public abstract void close(Connection connection);
    public abstract void test(Connection connection);
}
