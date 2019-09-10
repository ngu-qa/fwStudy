package Chapter9;

interface Processor {
    String name();
    Object process(Object input);
}

class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}

class Change {
    public String process(String s) {
        char[] c = new char[s.length()];
        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i += 2) {
                c[i] = s.charAt(i + 1);
                c[i + 1] = s.charAt(i);
            }
            return new String(c);
        } else {
            for (int i = 0; i < s.length() - 1; i += 2){
                c[i] = s.charAt(i+1);
                c[i+1] = s.charAt(i);
            }
            c[s.length()-1] = s.charAt(s.length()-1);
            return new String(c);
        }
    }
}
class Adapter implements Processor{
    public String name(){
        return "Adapter";
    }
    Change change;
    public Adapter(Change change){
        this.change = change;
    }
    public String process(Object input){
        return change.process((String)input);
    }
}
public class Test11 {
    public static void main(String[] args) {
        String s = "123456789";
        Apply.process(new Adapter(new Change()), s);
    }
}
