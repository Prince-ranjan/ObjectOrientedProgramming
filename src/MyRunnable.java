public class MyRunnable implements Runnable{

    private Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) { //
            counter.increment();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
thread1 =
thread1 : 0
thread2 : 0
thread1 : 1
thread2 : 1
thread1 : 2
thread2 : 2
 */