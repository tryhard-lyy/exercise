class threeSum {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i = 0;i<nums.length;i++){
            int r = nums.length-1;
            int l = i+1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(Math.abs(target-sum)<Math.abs(target-ans)){
                    ans = sum;
                }
                if(sum>target){
                    r--;
                }else if(sum<target){
                    l++;
                }else{
                    return ans;
                }
            }
        }
        return ans;
    }
}
