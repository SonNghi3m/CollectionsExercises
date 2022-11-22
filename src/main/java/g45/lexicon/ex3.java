package g45.lexicon;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Map<Integer, String> daysOfWeek = new HashMap<>();
        daysOfWeek.put(1, "Monday");
        daysOfWeek.put(2, "Tuesday");
        daysOfWeek.put(3, "Wednesday");
        daysOfWeek.put(5, "Friday");
        daysOfWeek.put(6, "Saturday");
        daysOfWeek.put(7, "Sunday");
       daysOfWeek.putIfAbsent(4, "Thursday");
        System.out.println(daysOfWeek.values());
    }
}
