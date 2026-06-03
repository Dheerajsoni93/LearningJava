package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple", 30);
        map.put("orange", 25);
        map.put("mango", 35);
        map.put("pineapple", 60);

        //multiple operations can be performed with hashmap

        //System.out.println(map);
        //map.remove("apple");
        //map.get("coconut");
        //map.containsKey("pineapple");
        //map.containsValue(1.00);
        //map.size();

        for(String key : map.keySet()){
            System.out.println(key + ": ₹" + map.get(key));
        }
    }
}
