package Language_Basic;
//Write a Program to accept two integers as command line arguments and print the sum of the two numbers

public class Assignment3 {
    public static void main(String [] args) {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        System.out.printf("The sum of %d and %d is %d",x,y,x+y);
    }
}
