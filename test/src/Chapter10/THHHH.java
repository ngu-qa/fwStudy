package Chapter10;

class Show{
    private String s;
    public Show(String s){
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
public class THHHH {
    private int oi = 1;
    private void hi() { System.out.println("Outer hi"); }
    class Inner {
        void modifyOuter() {
            oi *= 2;
            hi();
        }
    }
    public void showOi() { System.out.println(oi); }
    void testInner() {
        Inner in = new Inner();
        in.modifyOuter();
    }
    public static void main(String[] args) {
        THHHH out = new THHHH();
        out.showOi();
        out.testInner();
        out.showOi();
    }
}
