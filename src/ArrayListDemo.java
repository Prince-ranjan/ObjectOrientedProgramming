import java.util.*;

import static java.util.Collections.swap;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(5);
        list.add(60);
        list.add(70);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(returnSmallestElement( list));

        System.out.println(returnLargestElement( list));

        System.out.println(allElementGreaterThan50((ArrayList<Integer>) list));


//        System.out.println(list);
//
//        Collections.sort(list);
//
//        System.out.println(list);
//
//        List<Integer> list1 = new ArrayList<>();
//
//        Integer x = 9;
//        for (int i = 0; i < list.size(); i++) {
//            if(i == 4){
//                list1.add(x);
//            }
//            list1.add(list.get(i));
//        }
//
//        System.out.println(list1);
    }


    static int allElementGreaterThan50(ArrayList<Integer> arrayList) {

        int numberOfAllElementsGreaterThan50 = 0;

        for(Integer i : arrayList) { //TC :- O(n)
            if( i > 50) {
                numberOfAllElementsGreaterThan50++;
            }
        }
        return numberOfAllElementsGreaterThan50;
    }


    static int returnSmallestElement(List<Integer> arrayList)
    {
        TreeSet<Integer> treeSet = new TreeSet<>(arrayList);

        return treeSet.first();
    }


    static int returnLargestElement(List<Integer> list) {
        TreeSet<Integer> treeSet = new TreeSet<>(list);

        return treeSet.last();
    }


































//        List<Integer> list = new ArrayList();
//        list.add(40);
//        list.add(10);
//        list.add(30);
//        list.add(20);
//        list.add(50);
//        list.add(5);
//        System.out.println(list);
//        List<Integer> sum = game(list);
//        System.out.println(list.size());
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//        for(int i=0;i<list.size();i++) {
//            Integer x = (Integer)list.get(i) + 100;
//            list.set(i,x);
//        }
//
//        Iterator<Integer> itr = list.iterator();
//
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//
//        for(Object i : list) {
//            System.out.println(i);
//        }
//
//        System.out.println(list);
//
//    }
//
//    private static List<Integer> runningSum(List<Integer> list) {
//        List<Integer> runningList = new ArrayList<>();
//        int sum = 0;
//        for(Integer i : list) {
//            sum += i;
//            runningList.add(sum);
//        }
//        System.out.println(runningList);
//        return runningList;
//    }
//
//    private static List<Integer> game(List<Integer> list) {
//        Collections.sort(list);
//        for(int i = 0; i < list.size() - 1; i+=2) {
//            int x = list.get(i);
//            int y = list.get(i+1);
//            int tmp = x;
//            list.set(i,y);
//            list.set(i+1,tmp);
//        }
//        System.out.println(list);
//        return list;
//    }
////                                     15              10
//    private static void swap(Integer integer, Integer integer1) {
//        Integer tmp = integer; // 10
//        integer = integer1;
//        integer1 = tmp;
//    }
}
