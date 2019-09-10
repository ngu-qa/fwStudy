package Chapter2;

public class ChapterTest5 {
    static String ss = "j345kasg";

    public int storage(String s){
        return s.length() * 2;
    }

    public static void main(String[] args) {
        ChapterTest5 dd = new ChapterTest5();
        int num = dd.storage(ss);
        System.out.println(num);
    }
}
