package C20240625_OOP.Models;

public class Student {
    String name;
    String lastname;
    int tuition;
    int grades;
    int year;

    // TO DO: Implement Constructor

    public Student(String name, String lastname, int tuition, int grades, int year) {
        this.name = name;
        this.lastname = lastname;
        this.tuition = tuition;
        this.grades = grades;
        this.year = year;
    }


    // TO DO: Implement method to print full name
    public String fullName() {
        return name + " " + lastname;
    }

    // TO DO: Implement method to check if approved
    // To validate that the student has passed
    public boolean approved() {
        return grades >= 4;
    }

    // TO DO: Implement method to change year if approved
    // This is to change the student's year if he or she has passed
    public void passesYear() {
        if (approved()) {
            year++; //2025 + 1
            System.out.println("Student " + fullName() + " has advanced to the year " + year);
        } else {
            System.out.println(fullName() + " has failed");
        }
    }
    // Method to show information
    public void showInformation(){
        System.out.println("Student: " + fullName());
        System.out.println("Enrolled student: " + tuition);
//        System.out.println("Enrolled student: " + fullName());
    }
}