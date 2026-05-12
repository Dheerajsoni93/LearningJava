package OOPSInJava.Constructors;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Dheeraj Soni", 23, 9.08, "dheeraj45@gmail.com");
        Student student2 = new Student("Garvit Gupta", 24, 9.12);
        Student student3 = new Student("Aayushman Chandra", 22, 8.90);

//        Student[] students = new Student[3];
        Student[] students = {student1, student2, student3};

//        for(int i = 0; i < 3; ++i){
//            System.out.println(students[i].name);
//            System.out.println(students[i].age);
//            System.out.println(students[i].gpa);
//            System.out.println(students[i].email);
//            System.out.println(students[i].isEnrolled);
//            students[i].study();
//        }

        for(Student student : students){
            System.out.println(student.name);
            System.out.println(student.age);
            System.out.println(student.gpa);
            System.out.println(student.email);
            System.out.println(student.isEnrolled);
            student.study();
        }
    }
}
