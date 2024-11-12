package skillmea.student;

//access modifier (private, package-private, protected, public)
public class Student {
    // Instance variables
    private String name;
    private int age;

    //static variable shared for all instances of class Student
    public static int totalStudents = 0;
    public static final int MINIMUM_AGE = 15;

    // constructor
    public Student(String name, int age) {
        this.name = name;

        if (age < MINIMUM_AGE) {
            throw new IllegalArgumentException("Minimum age is " + MINIMUM_AGE);
        }
        this.age = age;
        totalStudents++;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //method
    public void printInfo() {
        System.out.println("My name is " + this.name + ", and I am " + this.age + " years old.");
        System.out.println("Total students in school: " + totalStudents);
    }
}
