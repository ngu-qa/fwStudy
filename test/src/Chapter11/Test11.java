package Chapter11;

import java.util.Collection;
import java.util.Iterator;
import java.util.*;

public class Test11 {
    public static void ergodic(Collection c) {
        Iterator i = c.iterator();
        while (i.hasNext()) {
            System.out.println(i.next() + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ArrayList<String> dd = new ArrayList<String>(Arrays.asList("1","2","2","3"));
        LinkedList<Character> ll = new LinkedList<Character>(Arrays.asList('a', 'b', 'c'));
        HashSet<Float> hs = new HashSet<Float>(Arrays.asList(1.1f, 2.2f, 3.3f));
        TreeSet<Double> ts = new TreeSet<Double>(Arrays.asList(1.11, 2.22, 3.33));
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(Arrays.asList(11, 22, 33));
        ergodic(al);
        ergodic(dd);
        ergodic(ll);
        ergodic(hs);
        ergodic(ts);
        ergodic(lhs);
    }
}
