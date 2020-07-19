package Hare_and_Tortoise;
class Hare extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);

        }
    }
}

class Tortoise extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
public class Race1AB  implements Runnable {
    static Tortoise tortoise;
    static Hare hare;

    public static void main(String[] args) {
        tortoise = new Tortoise();
        tortoise.setName("Tortoise");
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare = new Hare();
        hare.setName("Hare");
        hare.setPriority(Thread.MAX_PRIORITY);

        Thread t = new Thread(new Race1AB());

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