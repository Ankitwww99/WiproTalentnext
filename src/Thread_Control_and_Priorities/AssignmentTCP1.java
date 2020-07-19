package Thread_Control_and_Priorities;
/*
Create a thread which prints 1 to 10. After printing 5, there should be a delay of 5000 milliseconds before printing 6
 */
public class AssignmentTCP1 implements Runnable {
    static Thread t1;

    public static void main(String[] args) {
        t1 = new Thread(new AssignmentTCP1());
        t1.start();

    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i == 6)
                try {
                    System.out.println("Delay");
                    t1.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println(i);
        }
    }

}