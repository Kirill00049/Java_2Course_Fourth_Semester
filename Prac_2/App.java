package Prac_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

import static java.time.LocalDate.of;

public class App {
    ArrayList <Human> array = new ArrayList<>();
    public void printArray(){
        for (var human: array){
            System.out.println(human);
        }
    }
    public void work(){
        array.add(new Human(61, "Kirill", "Shapovalov", of(2003, 04, 18), 60));
        array.add(new Human(60, "Andrew", "Bel", of(2003, 05, 16), 59));
        array.add(new Human(18, "Nicolay", "Meow", of(2002, 11, 12), 59));
        System.out.println("Create people");
        printArray();

        System.out.println("\nSort last index of lastName");
        Stream<Human> stream1 = array.stream();
        stream1.sorted(Comparator.comparing(human -> human.lastName.charAt(human.lastName.length() - 1)))
                .forEach(System.out::println);

        System.out.println("\nFilter age > weight");
        Stream<Human> stream2 = array.stream();
        stream2.filter(human -> (human.age > human.weight))
                .forEach(System.out::println);

        System.out.println("\nSorted Birthdate");
        Stream<Human> stream3 = array.stream();
        stream3.sorted(Comparator.comparing(human -> human.birthDate))
                .forEach(System.out::println);

        System.out.println("\nMultiple age");
        ArrayList<Integer> t = new ArrayList<>();
        for (var human : array){
            t.add(human.age);
        }
        Stream<Integer> stream4 = t.stream();
        Optional <Integer> mul = stream4.reduce((x, y) -> x * y);
        System.out.println(mul.get());


    }
}
