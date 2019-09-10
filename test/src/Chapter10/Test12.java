package Chapter10;

interface Innner{
    void modify();
}

public class Test12 {
    private int oi = 1;
    private void hi() { System.out.println("Outer hi"); }
    public void showOi() { System.out.println(oi); }
    public Innner testInner() {
        return new Innner(){
            public void modify() {
                oi *= 2;
                hi();
            }
        };
    }
    public static void main(String[] args) {
        Test12 out = new Test12();
        out.showOi();
        out.testInner().modify();
        out.showOi();
    }
}
