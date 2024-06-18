import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(15);
        treeSet.add(11);
        treeSet.add(23);
        treeSet.add(0);
        treeSet.add(17);

        System.out.println(treeSet); // 0 11 15 17 23

        System.out.println(treeSet.floor(12)); // 11
        System.out.println(treeSet.ceiling(12)); // 15

        System.out.println(treeSet.first()); // 0

        System.out.println(treeSet.pollFirst()); // 0

        System.out.println(treeSet.first()); // 11

        System.out.println(treeSet.last()); // 23

        System.out.println(treeSet.pollLast()); // 23

        System.out.println(treeSet.last()); //17



    }
}
