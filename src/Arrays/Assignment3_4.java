package Arrays;
/*
 Initialize an integer array with ascii values and print the corresponding character values in a single row.
 */
public class Assignment3_4 {
    public static void main(String[] args) {
        int[] a={45,46,97,56,112,100,78,48,47,55};
        for(int i=0;i<a.length;i++){
            System.out.print((char)a[i]+" ");
        }
    }
}
