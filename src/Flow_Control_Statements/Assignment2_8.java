package Flow_Control_Statements;
/*
Write a program to receive a color code from the user (an Alphabhet).

The program should then print the color name, based on the color code given.

The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.

If color code provided by the user is not valid then print "Invalid Code".
input from user
input: R
output: Red
 */
import java.util.Scanner;

public class Assignment2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        switch(c1){
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'Y':
                System.out.println("Yello");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");
        }
    }
}
