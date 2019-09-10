package Chapter11;

import java.util.*;

public class Test17 {
    public static void main(String[] args) {
        Map<String, Gerbil> map = new HashMap<String, Gerbil>();
        map.put("Fuzzy", new Gerbil(0));
        map.put("Spot", new Gerbil(1));
        map.put("Speedy", new Gerbil(2));
        map.put("Dopey", new Gerbil(3));
        map.put("Sleepy", new Gerbil(4));
        map.put("Happy", new Gerbil(5));
        Iterator<String> iterator = map.keySet().iterator();
        ArrayList<String> ll = new ArrayList<String>(Arrays.asList("Fuzzy", "Spot", "Speedy"));
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s + ":");
            map.get(s).hop(ll);
        }
    }
}
