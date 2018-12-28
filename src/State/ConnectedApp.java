package State;

public class ConnectedApp {

    public static void main(String[] args) {
	// write your code here
        Connection connection = new Connection();

        connection.test();
        connection.open();
        connection.test();
        connection.close();
        connection.test();
    }
}
