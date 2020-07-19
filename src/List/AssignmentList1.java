package List;
/*
Write a Java program to create an ArrayList, add all the months of a year and print the same.
*/
import java.util.ArrayList;
import java.util.List;

public class AssignmentList1 {
    public static void main(String[] args) {
        List<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        for(String month: months)
            System.out.print(month+" ");

        System.out.println();
    }
}
