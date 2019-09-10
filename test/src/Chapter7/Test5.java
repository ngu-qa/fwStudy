package Chapter7;

class Test51{
    Test51(int i){
        System.out.println("111111111111111111111");
    }
}
class Test52 extends Test51{
    Test52(int j){
        //System.out.println("444444444444444444444");
        super(j);
        System.out.println("222222222222222222222");
    }
}

public class Test5 extends Test51{
    Test5(){
        super(11);
        System.out.println("3333333333333333333333");
    }
    Test52 x = new Test52(22);

    public static void main(String[] args) {
        Test5 y = new Test5();
    }
}
