package Set;

import java.util.HashSet;
import java.util.Iterator;

/*
Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator.
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
public class AssignmetSet2 {
    HashSet<Employee> h2 = new HashSet<>();

    void addEmployDetails(Employee employee)
    {
        h2.add(employee);
    }

    void printAllDetails()
    {
        Iterator<Employee> itr = h2.iterator();

        while (itr.hasNext())
        {
            Employee employee = itr.next();
            System.out.println("Id="+ employee.empId + " Name="+ employee.empName + " Email=" + employee.email + " Gender=" + employee.gender + " Salary=" + employee.salary);

        }
    }

    public static void main(String[] args) {
        AssignmetSet2 object = new AssignmetSet2();

        object.addEmployDetails(new Employee(101,"ankit","ankit@gmail.com","male",51000.0f));
        object.addEmployDetails(new Employee(102,"bharka","bharka@gmail.com","female",32000.0f));
        object.addEmployDetails(new Employee(103,"chetan","chetan@gmail.com","male",83000.0f));
        object.addEmployDetails(new Employee(104,"deepak","deepak@gmail.com","male",34000.0f));


        // Printing all employees details
        object.printAllDetails();
    }
}
