package C20240625_OOP;

import C20240625_OOP.Models.Course;
import C20240625_OOP.Models.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("------Exploring the Class Evaluation System Project-------\n");

        //Create student instances and test methods
        Student student1 = new Student("Luffy", "King of the Pirates", 101, 4, 2025 );
        Student student2 = new Student("Zoro", "Kaizoku Gari", 102, 5, 2025 );
        Student student3 = new Student("Nami", "Dorobō Neko", 103, 6, 2025 );
        Student student4 = new Student("Usopp", "Sogeking", 104, 3, 2025 );
        Student student5 = new Student("Sanji", "Kuro Ashi", 105, 6, 2025 );
        Student student6 = new Student("Tony Tony", "Chopper", 106, 6, 2025 );
        Student student7 = new Student("Nico Robin", "Devil Child", 107, 7, 2025 );
        Student student8 = new Student("Franky", "Cyborg", 108, 7, 2025 );
        Student student9 = new Student("Brook", "Soul King", 109, 5, 2025 );
        Student student10 = new Student("Jinbe", "Knight of the Sea", 110, 6, 2025 );


        student1.showInformation();
        System.out.println();
        student2.showInformation();
        System.out.println();
        student3.showInformation();
        System.out.println();
        student4.showInformation();
        System.out.println();
        student5.showInformation();
        System.out.println();
        student6.showInformation();
        System.out.println();
        student7.showInformation();
        System.out.println();
        student8.showInformation();
        System.out.println();
        student9.showInformation();
        System.out.println();
        student10.showInformation();
        System.out.println();


        System.out.println("-----------Prom check------------");
        student1.passesYear();
        student2.passesYear();
        student3.passesYear();
        student4.passesYear();
        student5.passesYear();
        student6.passesYear();
        student7.passesYear();
        student8.passesYear();
        student9.passesYear();
        student10.passesYear();

        //Course
        Course coursePirates = new Course("Straw Hats", "Pirates", 2025);

        //Enrolled students
        coursePirates.enrolledStudents(student1);
        coursePirates.enrolledStudents(student2);
        coursePirates.enrolledStudents(student3);
        coursePirates.enrolledStudents(student4);
        coursePirates.enrolledStudents(student5);
        coursePirates.enrolledStudents(student6);
        coursePirates.enrolledStudents(student7);
        coursePirates.enrolledStudents(student8);
        coursePirates.enrolledStudents(student9);
        coursePirates.enrolledStudents(student10);
        System.out.println(" ");

        //Count total enrolled students
        System.out.println("Total enrolled students " + coursePirates.countStudents() + "\n");

        //Show best grades
        System.out.println("Best grades " + coursePirates.obtainGrades() + "\n");

        //Describe students
        coursePirates.unenrollStudent(student1);
        System.out.println();

        //Show final quantity of students
        System.out.println("Final students " + coursePirates.countStudents() + "\n") ;


    }
}
