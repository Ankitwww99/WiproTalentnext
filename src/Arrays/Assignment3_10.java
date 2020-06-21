package Arrays;
/*
Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
 */

public class Assignment3_10 {
    public static int[]  evenOdd(int arr[]){
        int n=arr.length;
        int l=0,r=n-1;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                a[l]=arr[i];
                l++;
            }
            else{
                a[r]=arr[i];
                r--;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr=new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i]=Integer.parseInt(args[i]);
        }
        arr=evenOdd(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
