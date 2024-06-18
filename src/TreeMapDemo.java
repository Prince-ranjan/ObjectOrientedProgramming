import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Comparator<String> valueComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        };

        TreeMap<String, Integer> stockPrices = new TreeMap<>(valueComparator);

        stockPrices.put("Oracle", 138);

        stockPrices.put("Adobe", 438);

        stockPrices.put("Cisco", 349);

        stockPrices.put("Nvidia", 1048);

        stockPrices.put("Google", 1215);

        stockPrices.put("Microsoft", 456);

        stockPrices.remove("Oracle");

        stockPrices.put("Microsoft", 555);

        stockPrices.replace("Microsoft", 512, 666);

      System.out.println(stockPrices);


        TreeMap<Integer,Integer> map = new TreeMap<>();

        map.put(14,1); //6
        map.put(1,14); //1
        map.put(2,13); //2
        map.put(13,2); //5
        map.put(4,11); //3
        map.put(11,4);  //4

       // System.out.println(map);
    }
}
