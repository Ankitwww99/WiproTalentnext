package List;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
Write a program that will have a Vector which is capable of storing Employee objects.
Use an Iterator and enumeration to list all the elements of the Vector.
 */
class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    public Employee(){
        empId = 0;
        empName = null;
        email = null;
        gender = null;
        salary = 0.0f;
    }

    public Employee(int empId, String empName, String email, String gender, float salary)
    {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    void GetEmployeeDetails()
    {
        System.out.println("Employee details are: ");
        System.out.println("Id="+ empId + "\nName="+ empName + "\nEmail=" + email + "\nGender=" + gender + "\nSalary=" + salary);
    }
}
public class AssignmentList7 {
    public static void main(String[] args) {
        Vector<Employee> list = new Vector<>();

        list.add(new Employee(101,"ankit","ankit@gmail.com","male",51000.0f));
        list.add(new Employee(102,"bharka","bharka@gmail.com","female",32000.0f));
        list.add(new Employee(103,"chetan","chetan@gmail.com","male",83000.0f));
        list.add(new Employee(104,"deepak","deepak@gmail.com","male",34000.0f));

        System.out.println("Iterating vector list using iterator");
        Iterator<Employee> itr = list.iterator();

        while(itr.hasNext()) {
            Employee temp = itr.next();
            System.out.println("Id= "+ temp.empId + " Name= "+ temp.empName + " Email address= " + temp.email + " Gender= " + temp.gender + " Salary=" + temp.salary);
        }

        System.out.println("Iterating vector list using enumerator");

        Enumeration e = Collections.enumeration(list);
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
