package Chapter9;

abstract class Hao{}

class Kao extends Hao{
    protected void print(){
        System.out.println("Kao");
    }
}

abstract class Dad{
    abstract protected void print();
}
class Son extends Dad{
    protected void print(){
        System.out.println("Son");
    }
}
public class Test4 {
    public static void ll(Hao h){
        //h.print();
        ((Kao)h).print();
    }
    public static void lll(Son s){
        s.print();
    }
    public static void main(String[] args) {
        Kao k = new Kao();
        ll(k);
        Son ss = new Son();
        lll(ss);
    }
}
