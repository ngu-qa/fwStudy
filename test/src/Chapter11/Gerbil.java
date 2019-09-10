package Chapter11;

import java.util.ArrayList;

public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int i) {
        gerbilNumber = i;
    }

    public void hop(ArrayList kk) {
        for (int i = 0; i < kk.size(); i++) {
            System.out.println("Gerbil id = " + i);
            System.out.println("Gerbil is jumping");
        }
    }

    public static void main(String[] args) {
        Gerbil ll = new Gerbil(6);
        ArrayList<Gerbil> a = new ArrayList<Gerbil>();
        for (int i = 0; i < ll.gerbilNumber; i++) {
            a.add(new Gerbil(6));
        }
        ll.hop(a);
    }
}
