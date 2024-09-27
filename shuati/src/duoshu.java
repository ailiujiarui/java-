package src;

import java.util.HashMap;
import java.util.Map;

public class duoshu {
    public static void main(String[] args) {
             int nums[]={3,3,4};
              majorityElement(nums);
    }
    public static int majorityElement(int[] nums) {
        int num=0;
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
          if (!map.containsKey(nums[i])) {
              map.put(nums[i],0);
          }
          map.put(nums[i],map.get(nums[i])+1);
      }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            if (v > nums.length / 2) {
                num = k;
            }
        }
        return num;

    }
}
