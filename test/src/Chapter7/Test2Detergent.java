package Chapter7;

public class Test2Detergent extends Test2Cleanser{
    @Override
    public void scr() {
        append("Test2Detergent.scr() ");
        super.scr();
    }
    public void foam(){
        append("foam() ");
    }

    public static void main(String[] args) {
        Test2Detergent y = new Test2Detergent();
        y.dil();
        y.app();
        y.scr();
        y.foam();
        System.out.println(y);
        System.out.println("Testing!!!!!!!!!!");
        Test2Cleanser.main(args);
    }
}
