package Language_Basic;
/*
Write a Program that accepts two Strings as command line arguments and generate the output in the required format.

Example1)
If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.
*/

public class Assignment1 {
    public static void main(String[] args) {
        System.out.printf("%s Technologies %s",args[0],args[1]);
    }
}
