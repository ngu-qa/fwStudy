package Chapter8;

class Cycle {
    private String name = "Cycle";

    public static void travel(Cycle c) {
        System.out.println("Cycle.ride() " + c);
    }

    public String toString() {
        return this.name;
    }
}

class Unicycle extends Cycle {
    private String name = "Unicycle";

    public void balance() {
        System.out.println("Balance Unicycle");
    }

    public String toString() {
        return this.name;
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";

    public void balance() {
        System.out.println("Balance Bicycle");
    }

    public String toString() {
        return this.name;
    }

}

class Tricycle extends Cycle {
    private String name = "Tricycle";

    public String toString() {
        return this.name;
    }
}

public class Test17 {
    public static void main(String[] args) {
        Cycle[] i = {new Unicycle(), new Bicycle(),new Tricycle()};
        /**for (Cycle c:i){
            c.balance();
        }*/
        ((Unicycle)i[0]).balance();
        ((Bicycle)i[1]).balance();
        //((Bicycle)i[2]).balance();
        //((Tricycle)i[2]).balance();
    }
}
