package liushui;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class liushui {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        /*list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");*/
        Collections.addAll(list,"1,ikun","2,ikun","3,ikun");
        Stream<String> stream = list.stream();
        //stream.skip(1).distinct().limit(3).forEach(System.out::println);
        //System.out.println(stream.skip(1).distinct().count());
        Map<String, String> map = list.stream().collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split(",")[0];
            }
        }, s -> s.split(",")[1]));
        System.out.println(map);
        /*int []arr = {11,12,5,4,79,93,25};
        Arrays.stream(arr).forEach(System.out::println);

        Stream.of("ikun",44,11.00,'c').forEach(System.out::println);*/


    }
}
