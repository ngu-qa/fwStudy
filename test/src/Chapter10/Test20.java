package Chapter10;

public interface Test20 {
    int ll();
    class Po implements Test20{
        static void kk(Test20 t){
            System.out.println(t.ll());
        }
        public int ll(){
            System.out.println("iiiiiiiiiiii");
            return 444;
        }

        public static void main(String[] args) {
            Po ll = new Po();
            kk(ll);
        }
    }
}
