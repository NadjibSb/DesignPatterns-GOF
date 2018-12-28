package State;

public class Connection {
    private static ConnectionOpened connectionOpened;
    private static ConnectionClosed connectionClosed;
    private static ConnectionEstablished connectionEstablished;
    private ConnectionState state;

    public Connection() {
        connectionOpened = new ConnectionOpened();
        connectionEstablished = new ConnectionEstablished();
        connectionClosed = new ConnectionClosed();

        this.state = connectionClosed;
    }

    public void open(){
        state.open(this);
    }

    public void close(){
        state.close(this);
    }

    public void test(){
        state.test(this);
    }

    public void setState(ConnectionState state) {
        this.state = state;
    }

    public ConnectionOpened getConnectionOpened() {
        return connectionOpened;
    }

    public ConnectionClosed getConnectionClosed() {
        return connectionClosed;
    }

    public ConnectionEstablished getConnectionEstablished() {
        return connectionEstablished;
    }
}
