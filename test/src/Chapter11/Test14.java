package Chapter11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test14 {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        LinkedList<Integer> ld = new LinkedList<Integer>();
        System.out.println("ld = " + ld);
        for (Integer i:num) {
            ListIterator<Integer> ll = ld.listIterator((ld.size())/2);
            ll.add(i);
        }
        System.out.println("ld = " + ld);
    }
}
