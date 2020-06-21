package Arrays;
/*
Write a program to initialize an integer array and maximum and minimum value of the array.
 */
public class Assignment3_2 {
    public static void main(String[] args) {
        int[] ar={3,6,1,92,34,47,66,77,96};
        int max=ar[0],min=ar[0];
        for(int i=1;i<ar.length;i++){
            if(max<ar[i])
                max=ar[i];
            if(min>ar[i])
                min=ar[i];
        }
        System.out.printf("Max=%d and Min=%d",max,min);
    }
}
