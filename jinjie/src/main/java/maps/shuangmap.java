package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class shuangmap {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("ikun1","唱");
        hm.put("ikun2","跳");
        hm.put("ikun3","鸡你太美");
        hm.put("ikun4","rap");
        Set<String> ll = hm.keySet();
        //迭代器遍历集合
      /*  Iterator<String> it = ll.iterator();//先创建迭代器
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key);
            String value = hm.get(key);
            System.out.println(value);
        }*/
        //增强for循环遍历
        /*for(String key:ll){
            System.out.println("增强for循环遍历");
            System.out.println(key);
            System.out.println(hm.get(key));
        }*/

        //--------------------以上是通过set集合来遍历---------------------------------//
       /* //----------------------以下是通过键值对对象获取值-----------------------------//
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }*/
        //foreach传入匿名内部类实现遍历(第三种)
        /*hm.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(hm.get(key));
            }
        });
        */

    }



}
