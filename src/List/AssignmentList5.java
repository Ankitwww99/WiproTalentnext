package List;
/*
Implement the assignment 1 using Linked List
*/
import java.util.LinkedList;

public class AssignmentList5 {
    public static void main(String[] args) {
        LinkedList<String> months = new LinkedList<>();
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
