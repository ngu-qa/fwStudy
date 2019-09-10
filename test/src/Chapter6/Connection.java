package Chapter6;

public class Connection {
    private static int count = 0;
    private int i = 0;

    private Connection() {
        System.out.println("This is Connection()");
    }

    static Connection makeConnection() {
        count++;
        return new Connection();
    }

    public static int howMany() {
        return count;
    }

    public String toString() {
        return ("Connection " + count);
    }
}
