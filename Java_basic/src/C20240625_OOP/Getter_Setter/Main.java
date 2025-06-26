package C20240625_OOP.Getter_Setter;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Harry", 27);
        //Show values using toString();
        System.out.println(student1);

        //Result without toString()
        //C20240625_OOP.Getter_Setter.Student@8efb846

        //Result with toString()
        //Student{name: 'Harry', age 27}

        //Show values using getter
        System.out.println(" ");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());

        //toString() is like "translating" an object into readable text.
        //Without main and sout, you can't print

    }

}
