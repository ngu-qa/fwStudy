package Chapter2;

class StaticTest1 {
    static int i = 47;
}

class Incrementable {
    static void increment() { StaticTest1.i++; }
}

public class ChapterTest7 {
    static int a;

    public void deBug(){
        System.out.println("222222222222");
    }
    public static void main(String[] args) {
        System.out.println("StaticTest.i= " + StaticTest1.i);
        StaticTest1 st1 = new StaticTest1();
        StaticTest1 st2 = new StaticTest1();
        System.out.println("st1.i= " + st1.i);
        System.out.println("st2.i= " + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment() called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        st1.i = 3;
        System.out.println("After st1.i = 3, ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        System.out.println("Create another StaticTest, st3.");
        StaticTest1 st3 = new StaticTest1();
        System.out.println("st3.i = " + st3.i);
    }
}
