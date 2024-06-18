import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String args[]) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);  // This will add 4 at the end of the List.
        System.out.println(list);

        list.add(1, 50); // This will add 50 at index 1. All the other elements will be shifted to right.
        System.out.println(list);

        List newList = new ArrayList(); // Creating a new List which will be added to original list.
        newList.add(150);
        newList.add(160);

        list.addAll(newList); // This will add all the elements present in newList to list.
        System.out.println(list);

        System.out.println("The element at index two is " + list.get(1));

        System.out.println("The size of the List is  " + list.size());


        list.remove(1);  // This will remove the element at index 1 i.e 20.
        System.out.println(list);

        list.clear(); //This will remove all the elements from the list.
        System.out.println(list);



    }

    void howtoIterate() {
        List <Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for (int i = 0; i < list.size(); i++) { //Simple for loop
            System.out.println(list.get(i));
        }

        for (Integer i : list) {   //Enhanced for loop
            System.out.println(i);
        }
    }

    void howToIterateUsingIterator() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Iterating using forEachRemaining() method
        System.out.println("Iterating using forEachRemaining() method");
        Iterator<Integer> newItr = list.iterator();
        newItr.forEachRemaining(element -> System.out.println(element));
    }

    void sortingAnarrayList() {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        list.get(0);
        list.get(list.size() - 1);
        list.remove(0)
;
        Collections.sort(list);
        System.out.println("ArrayList in asc order: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("ArrayList in desc order: " + list);
    }

    void sortingAnArrayUsingStream() {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("ArrayList in asc order: " + sortedList);

        sortedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("ArrayList in desc order: " + sortedList);


    }

}
