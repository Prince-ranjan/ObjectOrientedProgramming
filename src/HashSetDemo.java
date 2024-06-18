import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set  = new HashSet<>();

        set.add(10);
        set.add(22);
        set.add(34);

        System.out.println(set.contains(44));

        set.remove(32);

        set.clear();
    }
}
