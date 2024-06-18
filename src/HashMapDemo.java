import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String,Integer> stockPrices = new HashMap<>();

        System.out.println(stockPrices.isEmpty());

        stockPrices.put("Oracle", 138);

        stockPrices.put("Adobe", 438);

        stockPrices.put("Nvidia", 1048);

        stockPrices.put("Microsoft", 456);

        stockPrices.put("Oracle", 125);

        System.out.println(stockPrices.isEmpty());

        Set<String> keys = stockPrices.keySet();

        Collection<Integer> valuers = stockPrices.values();

      //  System.out.println(valuers);

//        Map<String, List<Integer>> map = new HashMap<>();
//
//        map.put("Apple", new ArrayList<>())

//        System.out.println("Oracle stock price = " + stockPrices.get("Oracle"));
//
//        System.out.println("Microsoft stock price = " + stockPrices.get("Microsoft"));
//
//        System.out.println(stockPrices.getOrDefault("Google",989));
//        System.out.println(stockPrices.containsKey("Qualcomm"));
//
//        System.out.println(stockPrices.containsKey("Microsoft"));
//        stockPrices.remove("Oracle");
//
        System.out.println(stockPrices);
    }



}
