package Chapter7;

class Aa{
    Aa(){
        System.out.println("AAAAAAAAAAAAAAAAAAAAAA");
    }
}

class Bb extends Aa{
    Bb(){
        System.out.println("BBBBBBBBBBBBBBBBBBBBBB");
    }
}

public class Test3 extends Bb{
    /**Test3(){
        System.out.println("TTTTTTTTTTTTTTTTTTTTTTTT");
    }*/
    public static void main(String[] args) {
        Test3 dd = new Test3();
    }
}
