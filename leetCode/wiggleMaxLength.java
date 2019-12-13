class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }

        final int BEGIN = 0;
        final int UP = 1;
        final int DOWN = 2;
        int count = 1;
        int state = BEGIN;

        for(int i = 1;i<nums.length;i++){
            switch(state){
                case(BEGIN):
                    if(nums[i] > nums[i-1]){
                        state = UP;
                        count++;
                    }
                    else if(nums[i] < nums[i-1]){
                        state = DOWN;
                        count++;
                    }
                    break;
                case(UP):
                    if(nums[i] < nums[i-1]){
                        state = DOWN;
                        count++;
                    }
                    break;
                case(DOWN):
                    if(nums[i] > nums[i-1]){
                        state = UP;
                        count++;
                    }
                    break;
            }
        }

        return count;
    }
}
