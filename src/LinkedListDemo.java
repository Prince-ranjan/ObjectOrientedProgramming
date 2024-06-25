import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);

        linkedList.add(2);

        linkedList.add(3);

        System.out.println("LinkedList = " + linkedList);

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.addAll(list);
        list = list2;
        System.out.println("List = " + list);

        linkedList.addFirst(4);

        System.out.println("LinkedList = " + linkedList);

    }
}
