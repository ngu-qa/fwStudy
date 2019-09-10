package Chapter9;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class Char {
    private static Random r = new Random(128);

    public char ld() {
        return (char) r.nextInt();
    }

    public static void main(String[] args) {
        Char ll = new Char();
        for (int i = 0; i < 10; i++) {
            System.out.println(ll.ld() + " ");
        }
    }
}

public class Test16 extends Char implements Readable {
    private int count;

    public Test16(int count) {
        this.count = count;
    }
    public int read(CharBuffer cb){
        if (count-- == 0){
            return -1;
        }
        String result = Character.toString(ld()) + " ";
        cb.append(result);
        return result.length();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(new Test16(10));
        while (s.hasNext()){
            System.out.println(s.next() + " ");
        }
    }
}
