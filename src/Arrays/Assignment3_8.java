package Arrays;
/*
Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10
*/
public class Assignment3_8 {
    public static void main(String[] args) {
        int[] arr=new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i]=Integer.parseInt(args[i]);
        }
        System.out.println(sum67(arr));

    }

    private static int sum67(int[] arr) {
        boolean f=false;
        int s=0;
        int s67=0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
            if(arr[i]==6)
                f=true;
            if(f){
                s67+=arr[i];
            }
            if(arr[i]==7)
                f=false;
        }
        if(!f){
            return s-s67;
        }
        return s;
    }
}
