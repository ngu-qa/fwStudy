package Chapter9;

interface FastFood{
    void qwe();
    void asd();
    void zxc();
}
class Meal {
    Meal() {
        System.out.println("Meal()"); }
}

class Bread {
    Bread() { System.out.println("Bread()"); }
}

class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}

class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}

class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { System.out.println("PortableLunch()"); }
}

public class Sandwich extends PortableLunch implements FastFood{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lunch l = new Lunch();
    public Sandwich() { System.out.println("Sandwich8()"); }
    public void qwe(){
        System.out.println("qwe");
    }
    public void asd(){
        System.out.println("asd");
    }
    public void zxc(){
        System.out.println("zxc");
    }

    public static void main(String[] args) {
        Sandwich ss = new Sandwich();
        ss.asd();
        ss.qwe();
        ss.zxc();
    }
}
