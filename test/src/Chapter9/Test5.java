package Chapter9;

import Chapter8.Inter;

public class Test5 implements Inter {
    public void aa(){
        System.out.println("aaaaaaaaaaaaaaaaaaaa");
    }
    public void bb(){
        System.out.println("bbbbbbbbbbbbbbbbbbbb");
    }
    public void cc(){
        System.out.println("cccccccccccccccccccc");
    }

    public static void main(String[] args) {
        Test5 tt = new Test5();
        tt.aa();
        tt.bb();
        tt.cc();
    }
}
