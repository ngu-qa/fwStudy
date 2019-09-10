package Chapter6;

public class ConnectionManager {
    static int howMany = 4;

    private static Connection[] dd = new Connection[6];
    {
        for (Connection x:dd)
            x = Connection.makeConnection();
    }

    public static Connection get(){
        if (howMany > 0)
            return dd[--howMany];
        else {
            System.out.println("No more connections");
            return null;
        }
    }

    public static void main(String[] args) {
        for (Connection zz:dd){
            System.out.println(zz);
        }
        ConnectionManager ll = new ConnectionManager();
        System.out.println(howMany);
        get();
        System.out.println(howMany);
        get();
        System.out.println(howMany);
        get();
        System.out.println(get());
        System.out.println(howMany);
    }
}
