package Prac_1;

import java.util.ArrayList;


public class Main implements Predicate {
    @Override
    public boolean test(Object Students) {
        for (var student : ((ArrayList<Student>)Students)) {
            if (student.mark == 100){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Первый массив: ");
        ArrayList<Student> Students = new ArrayList<Student>();
        Students.add(new Student("Kirill", 100));
        Students.add(new Student("Andrew", 99));
        Students.add(new Student("Daniil", 50));
        Students.add(new Student("Mark", 66));
        for (var Student : Students) {
            System.out.println(Student.name + " " + Student.mark + "\t");
        }
        Main Proverka = new Main();
        System.out.println(Proverka.test(Students));

        System.out.println("\nВторой массив: ");
        ArrayList<Student> Students1 = new ArrayList<>();
        Students1.add(new Student("Kirill", 29));
        Students1.add(new Student("Andrew", 99));
        Students1.add(new Student("Daniil", 50));
        Students1.add(new Student("Mark", 66));
        for (var Student : Students1) {
            System.out.println(Student.name + " " + Student.mark + "\t");
        }
        System.out.println(Proverka.test(Students1));
    }
}

