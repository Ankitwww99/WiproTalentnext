package Arrays;
/*
Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
 */
public class Assignment3_9 {

    public static void main(String[] args) {
        int[] arr=new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i]=Integer.parseInt(args[i]);
        }
        arr=withoutTen(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static int[] withoutTen(int[] arr) {
        int n=arr.length;
        int l=0,r=n-1;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=10){
                a[l]=arr[i];
                l++;
            }
            else{
                a[r]=0;
                r--;
            }
        }
        return a;
    }
}
