import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(25);
        priorityQueue.add(10);
        priorityQueue.add(100);

//        System.out.println(priorityQueue);
//       while (!priorityQueue.isEmpty()) {
//           System.out.println(priorityQueue.poll());
//       }

       Queue<Integer> reversePriorityQueue  = new PriorityQueue<>(new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return  o2 - o1;
           }
       });

        reversePriorityQueue.add(30);
        reversePriorityQueue.add(20);
        reversePriorityQueue.add(25);
        reversePriorityQueue.add(10);
        reversePriorityQueue.add(100);

        System.out.println(reversePriorityQueue);
        while (!reversePriorityQueue.isEmpty()) {
            System.out.println(reversePriorityQueue.poll());
        }

    }

}
