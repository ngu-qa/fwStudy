package Chapter3;

public class ChapterTest10 {
    public static void main(String[] args) {
        int x = 1+4+16+64;
        int y = 2+8+32+128;
        System.out.println("x =  " + Integer.toBinaryString(x));
        System.out.println("y = " + Integer.toBinaryString(y));
        System.out.println("x & y = " + Integer.toBinaryString(x & y));
        System.out.println("x | y = " + Integer.toBinaryString(x | y));
        System.out.println("x ^ y = " + Integer.toBinaryString(x ^ y));
        System.out.println("~x = " + Integer.toBinaryString(~x));
        System.out.println("~y = " + Integer.toBinaryString(~y));
    }
}
