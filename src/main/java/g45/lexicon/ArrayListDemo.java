package g45.lexicon;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        ex7();
    }
    public static void ex1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(100);
        numbers.add(400);
        numbers.add(300);
        numbers.add(200);
        System.out.println("Size: " + numbers.size());
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer currentElement = iterator.next();
            //System.out.println(currentElement);
            if (currentElement == 400) {
                iterator.remove();
            }
        } //while
        System.out.println("Size: " + numbers.size());
        System.out.println("----------------------------------");

        }
    public static void ex2() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(100);
        numbers.add(400);
        numbers.add(300);
        numbers.add(200);
        System.out.println("Size: " + numbers.size());
        Integer result = numbers.remove(0); //remove by index
        boolean isRemove = numbers.remove(new Integer(100)); //remove by value

      /*  // remove by value reference
        Integer number = new Integer(100);
        boolean isRemove = numbers.remove(new Integer(100)); */

        for (Integer element : numbers) {
            System.out.println(element);
        }
        System.out.println("Size: " + numbers.size());


    }
    public static void ex3() {
        ArrayList<String> euCars = new ArrayList<>();
        euCars.add("Volvo");
        euCars.add("BMW");
        euCars.add("Volvo");

        ArrayList<String> usCars = new ArrayList<>();
        usCars.add("Tesla");
        euCars.addAll(usCars);
        //other options
       // euCars.addAll(0,usCars); // move usCar element to index 0 in euCars
        for (String element : euCars) {
            System.out.println(element);
        }

    }
    public static void ex4() {
        List<String> strings = new ArrayList<>();
        strings.add("D");
        strings.add("B");
        strings.add("A");
        strings.add("C");
        strings.add("a");

        Collections.sort(strings);
        System.out.println(strings);
        Collections.sort(strings, String.CASE_INSENSITIVE_ORDER);
        Collections.sort(strings, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        System.out.println(strings);

    }
    public static void ex5() {
        String test1 = "TEST";
        String test2 = "TEST";
        boolean isResult = test1.equals(test2);
        System.out.println(isResult);
        Person person1 = new Person(1,"Test", "Test", "TestTest");
        Person person2 = new Person(1,"Test", "Test", "TestTest");
        boolean isResult2 = person1.equals(person2);
        System.out.println(isResult2);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
    public static void ex6() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "test2", "test22", "test.test"));
        people.add(new Person(3, "test1", "test11", "test.test"));
        people.add(new Person(2, "test2", "test11", "test.test"));
        people.add(new Person(1, "test3", "test33", "test.test"));

        //sort by ID
        Collections.sort(people);
        for (Person person : people) {
            System.out.println(person.getId() + " " + person.getFirstName());
        }
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        for (Person person : people) {
            System.out.println(person.getId() + " " + person.getFirstName());
        }
    }
    public static void ex7() {
        /*Person person1 = new Person(1, "test", "test", "test.test");
        Person person2 = new Person(1, "test", "test", "test.test");
        List<Person> people = Arrays.asList(person1,person2);*/

        List<Person> people = Arrays.asList(
                new Person(1, "test", "test", "test.test"),
                new Person(1, "test", "test", "test.test"));
    }
}
