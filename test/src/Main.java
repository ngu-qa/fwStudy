import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Chapter6Test1 hh = new Chapter6Test1();
        hh.jjjjjj();
        Chapter6Test1.main(args);
    }
}
class StaticTest{
    static int i = 47;
}
class Incrementable{
    static void increment() {
        StaticTest.i++;
    }
}