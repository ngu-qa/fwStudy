package Chapter7;

class Component1{
    Component1(int i){
        System.out.println("11111111111111111111");
    }
    void dispose(){
        System.out.println("Component1.dispose() ");
    }
}
class Component2{
    Component2(int i){
        System.out.println("22222222222222222222");
    }
    void dispose(){
        System.out.println("Component2.dispose() ");
    }
}
class Component3{
    Component3(int i){
        System.out.println("33333333333333333333");
    }
    void dispose(){
        System.out.println("Component3.dispose() ");
    }
}
class Root{
    Root(int i){
        System.out.println("rrrrrrrrrrrrrrrrrrrr");
    }
    Component1 x = new Component1(1);
    Component2 y = new Component2(2);
    Component3 z = new Component3(3);
    void dispose(){
        x.dispose();
        y.dispose();
        z.dispose();
        System.out.println("Component1.dispose() ");
    }
}
public class Test9 extends Root{
    Component1 l1 = new Component1(1);
    Component2 l2 = new Component2(2);
    Component3 l3 = new Component3(3);

    Test9(int dd){
        super(dd);
        System.out.println("tttttttttttttttttttt");
    }
    void dispose(){
        l1.dispose();
        l2.dispose();
        l3.dispose();
        System.out.println("Test9.dispose() ");
    }
    public static void main(String[] args) {
        Test9 ll = new Test9(3);
        try{

        }finally {
            ll.dispose();
        }

    }
}
