package Flow_Control_Statements;

public class Assignment2_15 {
    public static void main(String[] args) {
        if(args.length==0)
            System.out.println("Please enter a integer number");
        else{
            int n=Integer.parseInt(args[0]);
            int i=1;
            while(i<=n){
                for(int k=0;k<i;k++){
                    System.out.print("* ");
                }
                System.out.println();
                i++;
            }
        }
    }
}
