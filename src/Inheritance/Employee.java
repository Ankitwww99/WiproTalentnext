package Inheritance;

public class Employee extends Person {
    double annualSalary;
    String startingYear;
    String insuranceNo;


    public Employee(String name, double annualSalary, String startingYear, String insuranceNo) {
        super(name);
        this.annualSalary = annualSalary;
        this.startingYear = startingYear;
        this.insuranceNo = insuranceNo;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(String startingYear) {
        this.startingYear = startingYear;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee [ Annual Salary=" + annualSalary + ", Insurance No=" + insuranceNo + ", Job Starting Year="
                + startingYear + " ]";
    }
}
