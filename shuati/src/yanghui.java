package src;

import java.util.ArrayList;
import java.util.List;

public class yanghui {
    public static void main(String[] args) {
     generate(5);
    }
    public static List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> ls =new ArrayList<>();
        ls.add(1); list.add(ls);

        if (numRows==1){
            return list;
        }
        for (int i = 1; i < numRows; i++) {
            //每层的集合
            ArrayList<Integer> three =new ArrayList<>();
            three.add(1);
            for (int j = 1; j < i; j++) {
                three.add(list.get(i-1).get(j)+list.get(i-1).get(j-1));
            }
            three.add(1);
            list.add(three);  }
        return list;     }
}
