package Arrays;
/*
 Given an array of type int, print true if every element is 1 or 4.

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
 */
public class Assignment3_11 {
    public static boolean only14(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]!=1 && a[i]!=4)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a=new int[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i]=Integer.parseInt(args[i]);
        }
        System.out.println(only14(a));
    }
}
