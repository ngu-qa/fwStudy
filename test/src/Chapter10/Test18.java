package Chapter10;

public class Test18 {
    private Test18() {
        System.out.println("555555555555555");
    }

    private static class Lll {
        Lll() {
            System.out.println("333333333333");
        }
    }

    public static void main(String[] args) {
        new Lll();
    }
}
