package Chapter9;

interface I1{
    void l1();
}
interface I2 extends I1{
    void l2();
}
interface I3 extends I1{
    void l3();
}
interface I4 extends I2,I3{
    void l4();
}
class Ld implements I4{
    public void l1(){
        System.out.println("11111111111111111111111");
    }
    public void l2(){
        System.out.println("22222222222222222222222");
    }
    public void l3(){
        System.out.println("33333333333333333333333");
    }
    public void l4(){
        System.out.println("44444444444444444444444");
    }
}
public class Test13 {
    public static void main(String[] args) {
        Ld ll = new Ld();
        ll.l1();
        ll.l2();
        ll.l3();
        ll.l4();
    }
}
