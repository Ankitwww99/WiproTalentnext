package Thread_Creation;
/*
Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. Display both thread names.
 */
public class AssignmentTC1 {
    public static void main(String[] args) {
        Thread t1 = new Thread("Scooby") {
            public void run(){
                System.out.println("Thread Name: " + Thread.currentThread().getName());
            }
        };

        Thread t2 = new Thread("Shaggy") {
            public void run(){
                System.out.println("Thread Name: " + Thread.currentThread().getName());
            }
        };

        t1.start();
        t2.start();
    }
}
