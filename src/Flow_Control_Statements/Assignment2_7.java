package Flow_Control_Statements;
/*
Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)
i/p:A
o/p:A->a
 */
import java.util.Scanner;

public class Assignment2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        if (c1 >= 'a' && c1 <= 'z')
            System.out.println((char)(c1-32));
        else if (c1 >= 'A' && c1 <= 'Z')
            System.out.println((char)(c1 + 32));
    }
}
