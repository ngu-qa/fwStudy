package Chapter11;

import java.util.*;
class Ger{
    private int gerbilNumber;
    public Ger(int i) {
        gerbilNumber = i;
    }
    public void hop(Iterator<Ger> it) {
        while (it.hasNext()){
            Ger g = it.next();
            System.out.println("Gerbil " + g + " hops");
        }
    }
    public String toString(){
        return String.valueOf(gerbilNumber);
    }
}
public class Test8 {
    public static void main(String[] args) {
        Ger ll = new Ger(10);
        ArrayList<Ger> gerbils = new ArrayList<Ger>();
        for(int i = 0; i < 10; i++)
            gerbils.add(new Ger(i));
        ll.hop(gerbils.iterator());
        // or, alternatively, using foreach syntax:
        //for(Ger g : gerbils)
        //    g.hop();
    }
}
