import java.util.*;

public class Main {
    public static void main(String[] args) {




        TreeMap<Integer,Float> m1 = new TreeMap<>();

        m1.put(1,1.2f);
        m1.put(2,2.2f);
        m1.put(3,3.3f);
        m1.put(4,4.4f);
        m1.put(5,5.5f);

        m1.forEach((k,v) -> System.out.println(k+":"+v));
        System.out.println("--------------------------------------------");
        TreeMap<Integer,Float> m2 = new TreeMap<>();
        m2.putAll(m1.headMap(3));
        m2.forEach((k,v) -> System.out.println(k+":"+v));
        System.out.println("--------------------------------------------");
        TreeMap<Integer,Float> m3 = new TreeMap<>();
        m3.putAll(m1.tailMap(3));
        m3.forEach((k,v) -> System.out.println(k+":"+v));

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4));

        list.stream()
                .filter(k -> k % 2 == 0)
                .forEach(System.out::println);






    }






    }
