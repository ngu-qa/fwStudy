package Chapter6;

import Chapter2.*;
import Chapter3.*;

public class Test1 {
    public static void main(String[] args) {
        ChapterTest6 dd = new ChapterTest6();
        Chapter3.ChapterTest7 ll = new Chapter3.ChapterTest7();
        Chapter2.ChapterTest7 zz = new Chapter2.ChapterTest7();
        ll.deBug();
        zz.deBug();
    }
}
