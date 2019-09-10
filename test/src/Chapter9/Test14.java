package Chapter9;

interface A1 {
    void a1();

    void a2();
}

interface B1 {
    void b1();

    void b2();
}

interface C1 {
    void c1();

    void c2();
}

interface D1 extends A1, B1, C1 {
    void d1();
}

abstract class L{
    int dd = 7;
    abstract void ll();
}
class D extends L implements D1{
    public void d1(){
        System.out.println("d1() ");
    }
    public void a1(){
        System.out.println("a1() ");
    }
    public void b1(){
        System.out.println("b1() ");
    }
    public void c1(){
        System.out.println("c1() ");
    }
    public void a2(){
        System.out.println("a2() ");
    }
    public void b2(){
        System.out.println("b2() ");
    }
    public void c2(){
        System.out.println("c2() ");
    }
    public void ll(){
        System.out.println("ll");
    }
}
public class Test14 {
    static void q(A1 a){a.a1();}
    static void w(B1 b){b.b1();}
    static void e(C1 c){c.c1();}
    static void r(D1 d){d.d1();}

    public static void main(String[] args) {
        D ld = new D();
        q(ld);
        w(ld);
        e(ld);
        r(ld);
    }
}
