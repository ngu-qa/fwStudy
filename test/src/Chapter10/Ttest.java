package Chapter10;

import java.util.HashMap;
import java.util.Map;

class Wrapping {
    private int i;

    public Wrapping(int x) {
        i = x;
    }

    public int value() {
        return i;
    }
}

public class Ttest {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            public int value() {
                //return this.value() * 47;
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        /**Ttest t = new Ttest(){
         {
         wrapping(1);
         }
         };

         Map<Integer, Integer> m = new HashMap<>(){
         {
         put(2,3);
         }
         };
         m.put(1,2);
         System.out.println();
         */
        Ttest ll = new Ttest();
        Wrapping w = ll.wrapping(44);
        System.out.println(w.value());
        /**Wrapping w = wrapping(44);
         System.out.println(w.value());
         */
    }
}
