package Chapter2;

class StaticTest {
    static int i = 4665;
}
public class ChapterTest6{
    void increment(){
        StaticTest.i++;
    }

    public static void main(String[] args) {
        ChapterTest6 dd = new ChapterTest6();
        dd.increment();
        //ChapterTest6.increment();
        System.out.println(StaticTest.i);
    }
}
