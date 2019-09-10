package Chapter10.P3;

import Chapter10.P1.Ptest1;
import Chapter10.P2.Ptest2;

public class Ptest3 extends Ptest2 {
    //Ptest2 zz = new Ptest2();
    Ptest1 hhh(){
        return this.new Zxc(55);
    }
    public static void main(String[] args) {
        Ptest3 jj = new Ptest3();
        jj.hhh();
    }
}
