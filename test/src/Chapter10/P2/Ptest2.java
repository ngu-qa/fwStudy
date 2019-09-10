package Chapter10.P2;

import Chapter10.P1.Ptest1;

public class Ptest2 {
    protected class Zxc implements Ptest1 {
        private int i;

        public Zxc(int i) {
            this.i = i;
        }

        public void pp() {
            System.out.println("this is ppppppp");
        }

        public int ll() {
            return i;
        }
    }
}
