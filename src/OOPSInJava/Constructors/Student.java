package OOPSInJava.Constructors;

public class Student {
    String name;
    int age;
    double gpa;
    String email;
    boolean isEnrolled;

    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.email = "Email not provided!";
        isEnrolled = true;
    }

    //overload constructors
    Student(String name, int age, double gpa, String email){
        this.name = name;
        this.age = age;
        this.email = email;
        this.gpa = gpa;
        isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }
}
