package Task;

import java.util.ArrayList;

public class MyTest {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        int e = 6;
        int f = 7;
        int g = 8;
        //MyLinkList ll = new MyLinkList();
        MyArrayList ll = new MyArrayList();
        ll.add(a);
        ll.add(b);
        ll.add(c);
        ll.add(c);
        ll.add(c);
        ll.add(d);
        ll.addAll(e, f);
        ll.add(2, g);

        System.out.println(ll.size());
        System.out.println(ll.get(0));
        System.out.println(ll.get(1));
        System.out.println(ll.get(2));
        System.out.println(ll.get(3));
        System.out.println(ll.get(4));
        System.out.println(ll.get(5));
        System.out.println(ll.get(6));
        System.out.println(ll.get(7));
        System.out.println(ll.get(8));
        System.out.println(ll.isEmpty());
        System.out.println(ll.remove(a));
        System.out.println(ll.size());
        System.out.println(ll.contains(f));
        System.out.println(ll.removeAll(c));
        System.out.println(ll.size());
        //ll.clear();
        System.out.println(ll.size());
        System.out.println(ll.get(0));
        System.out.println(ll.get(1));
        System.out.println(ll.get(2));
        System.out.println(ll.get(3));
        System.out.println(ll.get(4));
        System.out.println(ll.get(5));
        System.out.println(ll.get(6));
        System.out.println(ll.get(7));
        System.out.println(ll.get(8));
    }
}
