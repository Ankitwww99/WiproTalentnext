package Classes_and_Objects;
/*
Create a new class called Calculator with the following methods:
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.

 */
class Calculator {
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}
public class Assignment4_2 {
    public static void main(String[] args){
        System.out.println(Calculator.powerInt(12, 2));
        System.out.println(Calculator.powerDouble(1.5, 2));
    }
}
