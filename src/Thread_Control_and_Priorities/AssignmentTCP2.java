package Thread_Control_and_Priorities;
/*
Create two threads, one thread to display all even numbers between 1 & 20, another to display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers
Hint: use join
 */
public class AssignmentTCP2 implements Runnable {
    static Thread oddThread;
    static Thread evenThread;

    public static void main(String[] args) {
        AssignmentTCP2 object2 = new AssignmentTCP2();

        oddThread = new Thread(object2, "OddThread");
        evenThread = new Thread(object2, "EvenThread");

        oddThread.start();
        evenThread.start();
    }

    @Override
    public void run() {
        try {
            if (Thread.currentThread().getName().equals("OddThread"))
                evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i=1;i<=20;i++) {
            if (Thread.currentThread().getName().equals("EvenThread")) {
                if (i%2==0)
                    System.out.println(i);
            }

            else if (Thread.currentThread().getName().equals("OddThread")) {
                if (i%2!=0)
                    System.out.println(i);
            }
        }
    }

}
