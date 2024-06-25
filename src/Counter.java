public class Counter {
    private int count = 0;


    //sync it ensures that only one thread can execute it at a time
    public  synchronized void increment() {
        count++;
    }

    public  int getCount() {
        return count;
    }
}
