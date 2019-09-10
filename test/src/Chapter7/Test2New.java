package Chapter7;

public class Test2New extends Test2Detergent{
    @Override
    public void scr() {
        append("Test2New.scr() ");
        super.scr();
    }
    public void sterilize(){
        append("sterilize() ");
    }

    public static void main(String[] args) {
        Test2New z = new Test2New();
        z.dil();
        z.app();
        z.scr();
        z.sterilize();
        System.out.println(z);
        System.out.println("Ending!!!!!!!!!");
        Test2Detergent.main(args);
    }
}
