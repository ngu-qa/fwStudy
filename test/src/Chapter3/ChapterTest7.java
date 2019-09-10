package Chapter3;

import java.util.*;
public class ChapterTest7 {
    public void deBug(){
        System.out.println("33333333333");
    }
    public static void main(String[] args) {
        Random a = new Random();
        int dd = a.nextInt();
        System.out.println(dd);
        if(dd % 2 == 0) System.out.println("heads");
        else System.out.println("tails");

    }
}
