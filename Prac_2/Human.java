package Prac_2;

import java.time.LocalDate;

public class Human {
    int age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    int weight;
    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    public String toString(){
        String res = ("\nAge: " + age + "\nFirstName: " + firstName +
                "\nLastName: " + lastName + "\nBirthDate: " + birthDate +
                "\nWeight: " + weight);
        return res;
    }
}
