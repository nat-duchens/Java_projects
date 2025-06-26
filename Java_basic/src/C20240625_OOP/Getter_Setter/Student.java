package C20240625_OOP.Getter_Setter;

public class Student {

    //Private attributes: cannot be accessed directly from outside the class
    private String name;
    private int age;

    //Constructor: It is called automatically when creating a new object
    public Student(String name, int age) {
        //this -> refers to the attribute of the class
        this.name = name; //Assign the parameter to the 'name' attribute
        this.age = age;
    }

    //Getter -> allows you to read and obtain the value in a controlled manner
    public String getName() {
        return name;
    }
    //Setter -> allows you to read and change the value if needed
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student{" +
                "name: '" + name + '\'' +
                ", age " + age +
                '}';
    }

}
