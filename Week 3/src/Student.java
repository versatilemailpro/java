import java.util.ArrayList;

public class Student {
    // properties
    public String name;
    public int rollNo;
    public int standard;
    public ArrayList<String> qualifications;

    // Constructor
    Student(String name, int rollNo, int standard, ArrayList<String> qualifications) {
        this.name = name;
        this.rollNo = rollNo;
        this.standard = standard;
        this.qualifications = qualifications;
    }

    // Method
    public void printDetails() {
        System.out.println("Name of Student is " + name);
        System.out.println("Roll No is " + rollNo);
        System.out.println("Standard is " + standard);

        for (String qualification : qualifications) {
            System.out.println(qualification);
        }
    }

}
