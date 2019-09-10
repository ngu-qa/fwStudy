package Chapter11;

import java.util.*;

class Generator {
    int i = 0;
    public String next() {
        switch (i) {
            default:
            case 0:
                i++;
                return "0";
            case 1:
                i++;
                return "1";
            case 2:
                i++;
                return "2";
            case 3:
                i++;
                return "3";
            case 4:
                i++;
                return "4";
            case 5:
                i++;
                return "5";
            case 6:
                i++;
                return "6";
            case 7:
                i++;
                return "7";
            case 8:
                i = 0;
                return "8";
        }
    }
    public Collection fill(Collection<String> c, int num) {
        for (int n = 0;i<num;i++){
            c.add(next());
        }
        return c;
    }
}

public class Test4 {
    public static void main(String[] args) {
        Generator gg = new Generator();
        System.out.println(gg.fill(new ArrayList<String>(), 10));
        System.out.println(gg.fill(new LinkedList<String>(), 10));
        System.out.println(gg.fill(new HashSet<String>(), 10));
        System.out.println(gg.fill(new LinkedHashSet<String>(), 10));
        System.out.println(gg.fill(new TreeSet<String>(), 10));
        ArrayList<Integer> ll = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,3));
        ArrayList<Integer> dd = new ArrayList<Integer>(Arrays.asList(2,8));
        ll.removeAll(dd);
        System.out.println(ll);
    }
}
