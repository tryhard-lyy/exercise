class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }

        return false;
    }
}

class Solution {
  public boolean containsDuplicate(int[] nums) {
      Set<Integer> set = new HashSet<>();
      for(int item:nums){
        if(set.contains(item) return true;
        set.add(item);
      }
      
      return false;
    }


}
