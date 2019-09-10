package Chapter10;

class Baba{
    public Baba(int x){
        System.out.println(x);
    }
}
class Susu{
    public Baba ll(){
        System.out.println("this is Susu.ll() ");
        return new Baba(5);
    }
}
public class Test15 {
    public Baba dd(int i){
        return new Baba(i){
            {System.out.println("3333333333333333333333 ");}
        };
    }

    public static void main(String[] args) {
        Test15 ld = new Test15();
        Baba kk = ld.dd(55);
    }
}
