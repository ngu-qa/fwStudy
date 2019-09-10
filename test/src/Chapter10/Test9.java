package Chapter10;

interface Lx{
    void ll();
}
public class Test9 {
    Lx f() {
        return new Lx(){
            public void ll() {
                System.out.println("111111111111111111111111");
            }
        };
    }
    public static void main(String[] args) {
        Test9 x = new Test9();
        x.f().ll();
    }
}
