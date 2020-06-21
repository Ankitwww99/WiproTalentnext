package Arrays;
/*
Write a program to initialize an array and print them in a sorted order.
 */
import java.util.Arrays;

public class Assignment3_6 {
    public static void main(String[] args) {
        int[] ar={3,6,1,92,34,47,66,77,96};
        Arrays.sort(ar);
        //we can also apply any sorting algorithm like bubble sort, linear sort,etc.
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }

    }
}
