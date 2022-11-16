package g45.lexicon;

import java.util.HashMap;
import java.util.Map;
// Map is used when we want to define a group of objects which will be finded by specific key.
public class HashMapDemo {
    public static void main(String[] args) {
    ex1();
    }
    public static void ex1() {
        Map<String, String> contactMap = new HashMap<>();
        contactMap.put("Simon", "simon@lexicon.se");
        contactMap.put("Mehrdad", "mehrdad@lexicon.se");
        System.out.println(contactMap.get("Simon"));
        System.out.println(contactMap.containsKey("Simon")); // check if key is contained in the Map or no.
        System.out.println(contactMap.containsValue("Simon")); // check if value is contained in the Map or no.
        System.out.println(contactMap.putIfAbsent("Son", "Sonmail")); // find no key/value ==> add
        System.out.println(contactMap.putIfAbsent("Mehrdad", "Sonmail")); // same key ==> return original value: mehrdad@lexicon.se
        System.out.println(contactMap.putIfAbsent("mehrdad", "Sonmail")); // case sensitive ==> add
        System.out.println(contactMap.putIfAbsent("abc", "Sonmail")); // same value ==> add
        System.out.println(contactMap.replace("Mehrdad", "abcsdfs@gmail.com"));
        System.out.println("--------------------------------------------------------");

        for (Map.Entry entry: contactMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("--------------------------------------------------------");

        Map<Integer, String> contactMap2 = new HashMap<>();
        contactMap2.put(1, "simon@lexicon.se");
        contactMap2.put(2, "mehrdad@lexicon.se");

        System.out.println(contactMap2.get(2));
    }
}
