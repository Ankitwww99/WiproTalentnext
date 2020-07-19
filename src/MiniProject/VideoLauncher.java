package MiniProject;
/*
mini project 2
oops inheritance
 */
import java.util.Scanner;

class Video{
    String videoName;
    boolean checkout;
    int rating;

    public Video(String name) {
        videoName = name;
    }

    String getName(){
        return videoName;
    }

    void doCheckout(){
        checkout=true;
        System.out.println("Video "+'"'+ getName()+'"' +" checked out successfully.");
    }

    void doReturn(){
        checkout=false;
        System.out.println("Video "+'"'+ getName()+'"' +" returned successfully.");
    }

    void receiveRating(int rating){
        this.rating=rating;
    }

    int getRating(){
        return rating;
    }

    boolean getCheckout(){
        return checkout;
    }
}

class VideoStore{
    Video[] store=new Video[100];
    static int no=0;

    void addVideo(String name) {
        for(int ind=0;ind<store.length;ind++){
            if(store[ind]==null){
                store[ind]=new Video(name);
                no++;
            }
        }

    }

    void doCheckout(String name){
        for(int i=0;i<store.length;i++){
            if(store[i]!=null && store[i].videoName.equals(name)){
                store[i].doCheckout();
                break;
            }
        }
    }

    void doReturn(String name){
        for(int i=0;i<5;i++){
            if(store[i]!=null && store[i].videoName.equals(name)){
                store[i].doReturn();
                break;
            }
        }
    }

    public void receiveRating(String name, int rating) {
        for(int i=0;i<5;i++){
            if(store[i]!=null && store[0].videoName.equals(name)){
                store[i].receiveRating(rating);
            }
        }
        System.out.println("Rating "+'"'+rating+'"'+" has been mapped to the Video" + '"'+ name+'"');

    }
    public void listInventory(){
        System.out.println("------------------------------------------");
        System.out.println("Video Name\t|\tCheckout Status |\tRating");
        for(int i=0;i<no;i++){
            if(store[i].checkout!=false) {
                System.out.println(store[i].getName() + "\t\t|\t\t\t" + store[i].getCheckout() + "\t |\t" + store[i].getRating());
            }
        }
        System.out.println("------------------------------------------");
    }

}
public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        VideoStore videoStore=new VideoStore();
        do {
            System.out.println("MAIN MENU \n=========");
            System.out.println("1. Add Videos:");
            System.out.println("2. Check Out Video:");
            System.out.println("3. Return Video:");
            System.out.println("4. Receive Rating:");
            System.out.println("5. List Inventory:");
            System.out.println("6. Exit:");
            System.out.print("Enter your choice(1..6): ");

            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    videoStore.addVideo(sc.next());
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    videoStore.doCheckout(sc.next());
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to Return:");
                    videoStore.doReturn(sc.next());
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to Rate: ");
                    String name=sc.next();
                    System.out.print("Enter the rating for this video: ");
                    int rat=sc.nextInt();
                    videoStore.receiveRating(name,rat);
                    break;
                case 5:
                    videoStore.listInventory();
                    break;
                case 6:
                    System.err.println("Enter ...!! Thanks for using the application");
                    System.exit(1);
                    break;
            }
        }while(!(choice==6));
        sc.close();
    }
}
