package Flow_Control_Statements;
/*
Write a program to check if the program has received command line arguments or not.

If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)

Example1) java Example
O/P: No values

Example2) java Example Mumbai Bangalore
O/P: Mumbai,Bangalore
 */
public class Assignment2_3 {
    public static void main(String[] args) {
        int x=args.length;
        if(x==0)
            System.out.println("No value");
        else{
            for(int i=0;i<x-1;i++){
                System.out.print(args[i]+",");
            }
            System.out.print(args[x-1]);
        }
    }
}
