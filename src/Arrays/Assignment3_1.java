package Arrays;
/*
Write a program to initialize an integer array and print the sum and average of the array.
 */
public class Assignment3_1 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int sum=0;
        float avg=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        avg=(float)sum/a.length;
        System.out.printf("Sum=%d and Average=%f",sum,avg);
    }
}
