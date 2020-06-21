package Arrays;

import java.util.Scanner;

public class Assignment3_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter values of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter search element=");
        int searchElement=sc.nextInt();
        int f=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==searchElement){
                f=i;
                break;
            }
        }
        System.out.println(f);
    }
}
