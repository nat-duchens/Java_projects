package C20240625_OOP.Models;

import java.util.ArrayList;

public class Course {
    String nameCourse;
    String nameProfessor;
    int year;
    ArrayList<Student> enrolledStudents;

    // TO DO: Implement a constructor


    public Course(String nameCourse, String nameProfessor, int year) {
        this.nameCourse = nameCourse;
        this.nameProfessor = nameProfessor;
        this.year = year;
        this.enrolledStudents = new ArrayList<>(); //Add this manually, no with the Constructor
        //The array is not going to be used as a parameter
    }

    // TO DO: Implement a method to enroll a student
    public void enrolledStudents(Student student){
        enrolledStudents.add(student);
        System.out.println("Student " + student.fullName() + " has been enrolled in the course");

    }

    // TO DO: Implement a method to unenroll a student
    public void unenrollStudent(Student student){
        if (enrolledStudents.remove(student)){
            System.out.println("Student " + student.fullName() + " has been unenroll from the course");
        }else {
            System.out.println("The student is not enrolled in the course");
        }
    }

    // TO DO: Implement a method to count students
    public int countStudents(){
        return enrolledStudents.size();

    }

    // TO DO: Implement a method to get the best grade
    public int obtainGrades(){
        int greater = 0;
        for (Student student : enrolledStudents){
            if (student.grades > greater){
                greater = student.grades;
            }
        }
        return greater;
    }

}

