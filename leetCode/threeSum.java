package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static List<List<Integer>> getThreeSum(int[] nums){
        List<List<Integer>> resultlist = new ArrayList<>();
        int len = nums.length;

        if(nums == null || len<3){
            return resultlist;
        }

        Arrays.sort(nums);
        for(int i = 0;i<len;i++){
            if(nums[i] > 0){
                break;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = len-1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    resultlist.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r&&nums[l]==nums[l+1]) l++;
                    while(l<r&&nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }else if(sum<0){
                    l++;
                }else if(sum>0){
                    r--;
                }
            }
        }

        return resultlist;
    }
}
