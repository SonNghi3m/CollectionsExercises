package g45.lexicon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex2 {
    public static void main(String[] args) {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        Iterator<String> iterator = daysOfWeek.iterator();
        while (iterator.hasNext()) {
            String currentElement = iterator.next();
            if (currentElement == "Monday") System.out.println(currentElement);
            if (currentElement == "Tuesday") System.out.println(currentElement);
            if (currentElement == "Wednesday") System.out.println(currentElement);
            if (currentElement == "Thursday") System.out.println(currentElement);
            if (currentElement == "Friday") System.out.println(currentElement);
            if (currentElement == "Saturday") System.out.println(currentElement);
            if (currentElement == "Sunday") System.out.println(currentElement);
        }

    }
}
