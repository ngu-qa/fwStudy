package Chapter10;

import java.sql.SQLOutput;

public class Test1 {
    private String s;
    public Test1(String s){
        this.s = s;
    }
    class Inner{
        private int i = 88;
        public int value(){
            return i;
        }

        @Override
        public String toString() {
            return s;
        }
    }
    public Inner to(){
        return new Inner();
    }

    public static void main(String[] args) {
        Test1 ll = new Test1("ttttttttttttttttttt");
        Test1.Inner dd = ll.to();
        System.out.println(dd);
        System.out.println(dd.value());
    }
}
