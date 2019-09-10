package Chapter9;

interface Cycle{
    int move();
}
interface CycleFactory{
    Cycle getCycle();
}
class Unicycle implements Cycle{
    private int u = 77;
    public int move(){
        System.out.println("U = " + u);
        return u;
    }
}
class UnicycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Unicycle();
    }
}
class Bicycle implements Cycle{
    private int b = 88;
    public int move(){
        System.out.println("B = " + b);
        return b;
    }
}
class BicycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Bicycle();
    }
}
class Tricycle implements Cycle{
    private int t = 99;
    public int move(){
        System.out.println("T = " + t);
        return t;
    }
}
class TricycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Tricycle();
    }
}
public class Test18 {
    public static void play(CycleFactory factory){
        Cycle c = factory.getCycle();
        if (c.move() > 77){
            System.out.println(c.move());
        }
    }

    public static void main(String[] args) {
        play(new UnicycleFactory());
        play(new BicycleFactory());
        play(new TricycleFactory());
    }
}
