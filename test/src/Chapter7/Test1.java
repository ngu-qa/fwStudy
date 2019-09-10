package Chapter7;

class A{
    private String zz = "handsome";
    A(){
        System.out.println("lai le lao di !");
        zz = "ssssssss";
    }
    public String toString() {
        return zz;
    }
}
public class Test1 {
    private String ll;
    private A dd;

    /**public Test1(){
        dd = new A();
    }*/
    public String toString(){
        if (null == ll){
            ll = "kkkkkkkk";
        }
        return "dd = " + dd + " ll = " + ll;
    }

    public static void main(String[] args) {
        Test1 ceshi = new Test1();
        System.out.println(ceshi);
    }
}
