class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer item : nums){
            set.add(item);
        }

        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return -1;
    }
}

package LeetCode;

import java.util.*;

public class missNumber {
    public static int tomissingNumber(int[] nums) {
        Arrays.sort(nums);

        if(nums[0] != 0 ){
            return 0;
        }

        if(nums[nums.length-1] != nums.length){
            return nums.length;
        }

        for(int i = 0;i<nums.length-1;i++){
         if(nums[i] != nums[i+1]-1){
             return nums[i]+1;
         }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(missNumber.tomissingNumber(nums));
    }
}
