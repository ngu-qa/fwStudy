package Chapter7;

class Homer{
    int doh(int i){
        System.out.println("doh(int) ");
        return 1111;
    }
    char doh(char j){
        System.out.println("doh(char) ");
        return '8';
    }
    String doh(String i){
        System.out.println("doh(String) ");
        return "hhhhhhhhh";
    }
}
public class Test13 extends Homer{
    void doh() {
        System.out.println("Test13.doh() ");
    }

    public static void main(String[] args) {
        Test13 dd = new Test13();
        dd.doh();
        dd.doh(2);
        dd.doh('g');
        dd.doh("tt");
    }
}
