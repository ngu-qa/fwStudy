package Chapter3;

public class ChapterTest5 {
    String name;
    String says;

    public static void main(String[] args) {
        ChapterTest5 spot = new ChapterTest5();
        ChapterTest5 scruffy = new ChapterTest5();
        spot.name = "spot";
        spot.says = "Ruff!";
        scruffy.name = "scruffy";
        scruffy.says = "Wurf!";
        System.out.println(spot.name + " says " + spot.says);
        System.out.println(scruffy.name + " says " + scruffy.says);
        ChapterTest5 newName = new ChapterTest5();
        newName.name = spot.name = "ff";
        System.out.println(newName.name==spot.name);
        System.out.println(newName==spot);
        System.out.println(newName.equals(spot));
    }
}
