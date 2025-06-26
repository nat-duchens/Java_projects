package C20240625_OOP.OOP;

public class People {

    private String name;
    private int age;
    private String profession;

    //Right click -> Generate -> Constructor
    public People(String name, String profession, int age) {
        this.name = name;
        this.profession = profession;
        this.age = age;
    }

    //Right click -> Generate -> Getter and Setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    //Right click -> Generate -> toString()
    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}