package Chapter7;

class Test2Cleanser {
    private String s = "Test2New ";
    void append(String a){
        s += a;
    }
    void dil(){
        append("dil() ");
    }
    void app(){
        append("app() ");
    }
    void scr(){
        append("scr() ");
    }
    public String toString(){
        return s;
    }

    public static void main(String[] args) {
        Test2Cleanser x = new Test2Cleanser();
        x.dil();
        x.app();
        x.scr();
        System.out.println(x);
    }
}
