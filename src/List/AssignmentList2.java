//package List;
/*
1) Create an application for employee management with the following classes:

a) Create an Employee class with following attributes and behaviors :
i) int empId
ii)String empName
iii)String email
iv)String gender
v)float salary
vi) void GetEmployeeDetails() -> prints employee details

b) Create one more class EmployeeDB with the following attributes and behaviors.
(i)ArrayList list;
ii) boolean addEmployee(Employee e)  -> adds the employee object to the collection
iii) boolean deleteEmployee(int empId)  ->delete the employee object from the collection with the given empid
iv) String showPaySlip(int empId)  -> returns the payslip of the employee with the given empId

Provide implementation for all the methods and test your program.
 */

import java.util.ArrayList;
import java.util.Iterator;

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
class EmployeeDB
{
    ArrayList<Employee> list = new ArrayList<>();

    boolean addEmployee(Employee e)
    {
        if(e != null) {
            list.add(e);
            return true;
        }
        else
            return false;
    }

    boolean deleteEmployee(int empId)
    {
        Iterator<Employee> itr = list.iterator();
        while(itr.hasNext())
        {
            if(itr.next().empId == empId)
            {
                itr.remove();
                return true;
            }
        }
        return false;
    }

    String showPaySlip(int empId)
    {
        Iterator<Employee> itr = list.iterator();
        while(itr.hasNext())
        {
            Employee temp = itr.next();
            if(temp.empId == empId)
                return ("PaySlip of employee with empId "+ empId +" is: "+temp.salary);
        }
        return "Employee not found";
    }

}
public class AssignmentList2 {
    public static void main(String[] args)
    {
        EmployeeDB object = new EmployeeDB();

        Employee e1 = new Employee(101,"ankit","ankit@gmail.com","male",51000.0f);
        Employee e2 = new Employee(102,"bharka","bharka@gmail.com","female",32000.0f);
        Employee e3 = new Employee(103,"chetan","chetan@gmail.com","male",83000.0f);
        Employee e4 = new Employee(104,"deepak","deepak@gmail.com","male",34000.0f);

        if(object.addEmployee(e1))
            System.out.println("Employee added");
        else
            System.out.println("Employee is not of required type");

        if(object.addEmployee(e2))
            System.out.println("Employee added");
        else
            System.out.println("Employee is not of required type");

        if(object.addEmployee(e3))
            System.out.println("Employee added");
        else
            System.out.println("Employee is not of required type");

        if(object.addEmployee(e4))
            System.out.println("Employee added");
        else
            System.out.println("Employee is not of required type");


        System.out.println("Details of Employees are:- ");
        for(Employee emp : object.list)
            System.out.println(emp.empId + " " + emp.empName + " " + emp.email + " " + emp.gender + " " + emp.salary);

        System.out.println(object.showPaySlip(2));

        System.out.println(object.deleteEmployee(2));

        System.out.println("Details of Employees are:- ");
        for(Employee emp : object.list)
            System.out.println(emp.empId + " " + emp.empName + " " + emp.email + " " + emp.gender + " " + emp.salary);


        e2.GetEmployeeDetails();

    }
}
