class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int item : nums){
            if(sum > 0){
                sum += item;
            }else if(sum <= 0){
                sum = item;
            }

            ans = Math.max(sum,ans);
        }

        return ans;
    }
}
