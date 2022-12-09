import java.io.File;
import java.util.Scanner;

public class Person {

    public String name;
    public int age;
    public String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);

    }

    @Override
    public String toString() {

        return name + ", " + age + ", " + address;
    }

}
