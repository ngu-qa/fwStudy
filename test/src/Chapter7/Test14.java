package Chapter7;

class Engine{
    public void start(){}
    public void rev(){}
    public void stop(){}
    public void server(){
        System.out.println("ssssssssssssssssssss");
    }
}
class Wheel{
    public void inflate(int psi){}
}
class Window{
    public void rollup(){}
    public void rolldown(){}
}
class Door{
    public Window window = new Window();
    public void open(){}
    public void close(){}
}
public class Test14 {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door();
    public Door right = new Door();
    public Test14(){
        for (int i = 0;i < 4;i++){
            wheel[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Test14 dd = new Test14();
        dd.left.window.rollup();
        dd.wheel[0].inflate(47);
        dd.engine.server();
    }
}
