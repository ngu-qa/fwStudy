package Chapter10;

public class Test19 {
    private Test19(){
        System.out.println("1919191919991");
    }
    private static class Hhh{
        private Hhh(){
            System.out.println("hhhhhhhhhhhhhh");
        }
        private static class Kkkk{
            private Kkkk(){
                System.out.println("kkkkkkkkkkkkk");
            }
        }
    }

    public static void main(String[] args) {
        new Hhh();
    }
}
