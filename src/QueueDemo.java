import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueDemo {
    // Last in Last Out or First in First Out

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(12);
        queue.add(25);

        System.out.println("Queue : " + queue);
        System.out.println("Front element = " + queue.peek());

        System.out.println("Front element = " + queue.element());

        while (!queue.isEmpty()) {
            System.out.println("Element removed is = " + queue.poll());

        }
        System.out.println("Front element = " + queue.peek());


        // throw and throws


    }


}
