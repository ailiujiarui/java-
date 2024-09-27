package src;

import java.util.HashMap;

public class shuati {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        removeDuplicates(nums);

    }
    public static int removeDuplicates(int[] nums) {
        int k=1;
        //HashMap<Integer,Integer> map=new HashMap<>();
        /*for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                nums[k]=nums[i];
                k++;
                map.put(nums[i],1);
            }
        }*/
        int fast=0;
        int slow=0;
        for( fast=1;fast<nums.length;fast++){
            if(nums[slow]!=nums[fast]){
                nums[slow+1]=nums[fast];
                k++;
                slow++;
            }
        }
     return k;
    }
}
