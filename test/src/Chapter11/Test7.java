package Chapter11;

import java.util.ArrayList;
import java.util.List;

class Lp{
    public static int num = 0;
    public int id = num++;
    public String toString(){
        return String.valueOf(id);
    }
}
public class Test7 {
    private int k = 8;
    public static void main(String[] args) {
        Test7 t = new Test7();
        List<Lp> ll = new ArrayList<Lp>();
        for (int i = 0;i<t.k;i++){
            ll.add(new Lp());
        }
        List<Lp> dd = ll.subList(1,4);
        System.out.println("ll = " + ll);
        System.out.println("dd = " + dd);
        System.out.println();
        ll.removeAll(dd);
        System.out.println("ll = " + ll);
    }
}
