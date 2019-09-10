package Chapter7;

class Test81{
    Test81(int i, int j){
        System.out.println(i+j);
    }
}

public class Test8 extends Test81{
    private int x = 2;
    private int y = 3;
    Test8(){
        super(1,2);
        System.out.println(x+y);
    }
    Test8(int x1,int y1){
        super(x1,y1);
        x = x1;
        y = y1;
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        Test8 ll = new Test8();
        Test8 dd = new Test8(2,2);
    }
}
