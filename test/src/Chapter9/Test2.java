package Chapter9;

abstract class Dd{
    protected abstract void print();
    Dd(){
        print();
    }
}
class EEe extends Dd{
    private int ll = 66;

    @Override
    protected void print() {
        System.out.println(ll);
    }
}
public class Test2 {
    public static void main(String[] args) {
        //Dd ld = new Dd();
        EEe lld = new EEe();
        lld.print();
    }
}
