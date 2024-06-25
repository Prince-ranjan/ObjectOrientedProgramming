import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    static Semaphore semaphore = new Semaphore(3);

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread thread= new Thread(new Task(), "Thread-" + i);
            thread.start();
        }
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " acquired the permit .");

                Thread.sleep(4000);

                System.out.println(Thread.currentThread().getName() + " releasing the permit.");

                semaphore.release();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
