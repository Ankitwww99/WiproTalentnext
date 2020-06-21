package Arrays;
/*
Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
 */
import java.util.ArrayList;

public class Assignment3_7 {
    public static void main(String[] args) {
        int[] arr=new int[args.length];
        ArrayList<Integer> single = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            arr[i]=Integer.parseInt(args[i]);
            if(!single.contains(arr[i])){
                single.add(arr[i]);
            }
        }
        System.out.println(single);


    }
}
