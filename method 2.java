
class GoodMorningRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Good Morning Thread interrupted");
                return;
            }
        }
    }
}

class HelloRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Hello Thread interrupted");
                return;
            }
        }
    }
}

class WelcomeRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Welcome Thread interrupted");
                return;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GoodMorningRunnable r1 = new GoodMorningRunnable();
        HelloRunnable r2 = new HelloRunnable();
        WelcomeRunnable r3 = new WelcomeRunnable();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
    }
}
