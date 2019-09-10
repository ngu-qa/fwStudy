package Chapter6;

class A{
    protected int aa = 47;
}

class B{
    static void change(A ss,int bb){
        ss.aa = bb;
    }
}

public class Test6 {
    public static void main(String[] args) {
        A dd = new A();
        System.out.println(dd.aa);
        B.change(dd, 66);
        System.out.println(dd.aa);
    }
}
