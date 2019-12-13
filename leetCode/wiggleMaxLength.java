class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }

        int state = nums[1] - nums[0];//state表示当前状态为升还是降,>0升
        int count = state != 0 ? 2 : 1; 

        for(int i = 2;i < nums.length;i++){
            int diff = nums[i] - nums[i-1];//diff表示当前状态
            if(diff>0&&state<=0 || diff<0&&state>=0){
                count++;
                state = diff;
            }
        }

        return count;
    }
}
