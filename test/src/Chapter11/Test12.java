package Chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Test12 {
    private static List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    private static List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(2, 2, 2, 2, 2));

    public static void main(String[] args) {
        ListIterator<Integer> d1 = l1.listIterator();
        ListIterator<Integer> d2 = l2.listIterator();
        int len = l2.size();
        while (d1.hasNext()) {
            if (len > 0) {
                l2.add(len, d1.next());
            }
            len--;
        }
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
    }
}
