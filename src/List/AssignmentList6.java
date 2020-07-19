package List;

/*
 Implement the assignment 1 using Vector
 */
import java.util.List;
import java.util.Vector;

public class AssignmentList6 {
    public static void main(String[] args) {
        List<String> months = new Vector<>();
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
