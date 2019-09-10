package Chapter3;

class Letter{
    float c;
}
public class ChapterTest0 {
    static void f(Letter y){
        y.c = 3;
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 5;
        System.out.println("x.c = " + x.c);
        f(x);
        System.out.println("x.c = " + x.c);
    }
}
