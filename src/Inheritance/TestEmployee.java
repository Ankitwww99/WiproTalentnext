package Inheritance;
/*
Create a class called Person with a member variable name. Save it in a file called Person.java

Create a class called Employee that will inherit the Person class.The other data members of the Employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.Save this in a file called Employee.java

Your class should have the necessary constructors and getter/setter methods.

Write another class called TestEmployee, containing a main method to fully test your class definition.
 */
public class TestEmployee {
    public static void main(String[] args) {
        Person p = new Person("Ankit");
        System.out.println(p);
        Employee e = new Employee("Aman", 1000000, "2020", "bjs25dd4d");
        System.out.println(e.getName());
        System.out.println(e);
    }
}
