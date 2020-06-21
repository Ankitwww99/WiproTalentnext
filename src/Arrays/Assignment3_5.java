package Arrays;
/*
Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
 */
import java.util.Arrays;

public class Assignment3_5 {
    public static void main(String[] args) {
        int[] ar={3,6,1,92,34,47,66,77,96};
        /* alternate way
        Arrays.sort(ar);
        System.out.printf("Max1=%d and Min1=%d \nMax2=%d and Min2=%d",ar[ar.length-1],ar[0],ar[ar.length-2],ar[1]);
        */
        int max1=ar[0],min1=ar[0];
        int max2=ar[0],min2=ar[0];
        for(int i=1;i<ar.length;i++){
            if(max1<ar[i]){
                max2=max1;
                max1=ar[i];
            }
            if(min1>ar[i]){
                min2=min1;
                min1=ar[i];
            }
        }
        System.out.printf("Max1=%d and Min1=%d \nMax2=%d and Min2=%d",max1,min1,max2,min2);

    }
}
