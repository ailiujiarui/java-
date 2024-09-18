package collections;

import java.util.ArrayList;
import java.util.Collections;

public class collections {
   public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
       Collections.addAll(list, "a", "b", "c", "d", "e", "f");
       System.out.println(list );
       Collections.shuffle(list);
       System.out.println(list);
       Collections.reverse(list);
   }
}
