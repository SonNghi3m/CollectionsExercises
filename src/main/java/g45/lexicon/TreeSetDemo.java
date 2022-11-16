package g45.lexicon;

import java.util.Set;
import java.util.TreeSet;
// TreeSet implement Set Interface. It will default remove duplicate element and sort the array by compareTo method
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("a");
        treeSet.add("c");
        treeSet.add("d");
        treeSet.add("b");
        treeSet.add("b");
        System.out.println(treeSet);
        System.out.println("----------------");
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person(1, "Test", "Test", "test.test"));
        people.add(new Person(2, "Test2", "Test2", "test2.test"));
        people.add(new Person(1, "Test", "Test", "test.test"));
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
