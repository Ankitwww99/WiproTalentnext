package Hare_and_Tortoise;
class HareC extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            if (i == 60) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class TortoiseC extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
public class Race1ABC  implements Runnable {
    static TortoiseC tortoise;
    static HareC hare;

    public static void main(String[] args) {
        tortoise = new TortoiseC();
        tortoise.setName("Tortoise");
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare = new HareC();
        hare.setName("Hare");
        hare.setPriority(Thread.MAX_PRIORITY);

        Thread t = new Thread(new Race1ABC());

        tortoise.start();
        hare.start();
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            if (!tortoise.isAlive() && hare.isAlive()) {
                hare.stop();
                System.out.println("Tortoise won the race!");
                break;
            }
            if (!hare.isAlive() && tortoise.isAlive()) {
                tortoise.stop();
                System.out.println("Hare won the race!");
                break;
            }
        }
    }

}