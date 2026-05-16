package OOPSInJava.SuperKeyword;

public class Main {
    public static void main(String[] args) {
        // super = Refers to the parent class
        //               Used in constructors and method overriding
        //               Calls the parent constructor to initialize attributes

        Person person = new Person("Dheeraj", "Soni");
        Student student = new Student("Garvit", "Gupta", 3.25);
        Employee employee = new Employee("Aayushman", "Chandra", 50000);

        person.showName();
        //using super keyword, the variables in parent class (i.e. Person) are populated with values of student class variables.
        student.showName(); //calling method of parent class by using instance of child class
        student.showGPA();

        person.showName();
        employee.showName(); //calling method of parent class by using instance of child class
        employee.showSalary();
    }
}
