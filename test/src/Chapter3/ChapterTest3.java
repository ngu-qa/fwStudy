package Chapter3;

import java.util.Random;

public class ChapterTest3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt();
        int j = rand.nextInt();
        System.out.println("-1 " + Integer.toBinaryString(-1));
        System.out.println("+1 " + Integer.toBinaryString(+1));
        int maxpos = 2147483647;
        System.out.println("maxpos  " + Integer.toBinaryString(maxpos));
        int maxneg = -2147483648;
        System.out.println("maxneg " + Integer.toBinaryString(maxneg));
        System.out.println("i" + i);
        System.out.println("i " + Integer.toBinaryString(i));
        System.out.println("~i " + Integer.toBinaryString(~i));
        System.out.println("-i " + Integer.toBinaryString(-i));
        System.out.println("j " + Integer.toBinaryString(j));
        System.out.println("i & j " + Integer.toBinaryString(i & j));
        System.out.println("i | j " + Integer.toBinaryString(i | j));
        System.out.println("i ^ j " + Integer.toBinaryString(i ^ j));
        System.out.println("i << 5 " + Integer.toBinaryString(i << 5));
        System.out.println("i >> 5 " + Integer.toBinaryString(i >> 5));
        System.out.println("(~i) >> 5 " + Integer.toBinaryString((~i) >> 5));
        System.out.println("i >>> 5 " + Integer.toBinaryString(i >>> 5));
        System.out.println("(~i) >>> 5 " + Integer.toBinaryString((~i) >>> 5));
    }
}
