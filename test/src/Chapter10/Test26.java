package Chapter10;

class A1{
    A1(){
        System.out.println("this is A1 ");
    }
    public class A2{
        A2(){
            System.out.println("this is A2 ");
        }
    }
}
public class Test26 {
    Test26(){
        System.out.println("this is Test26 ");
    }
    public class Ld extends A1.A2{
        Ld(A1 a){
            a.super();
            System.out.println("this is Ld ");
        }
    }

    public static void main(String[] args) {
        Test26 l1 = new Test26();
        A1 l2 = new A1();
        Ld oo = l1.new Ld(l2);
    }
}
