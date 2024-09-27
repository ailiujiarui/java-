package maps;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        System.out.println(map.put("1", "1"));
        map.put("2", "2");
        map.put("3", "3");
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.get("2"));
        map.put("2", "4");
        System.out.println(map.remove("2"));
        System.out.println(map.containsKey("2"));
        System.out.println(map.containsValue("2"));
        map.clear();
        System.out.println(map.isEmpty());
    }
}
