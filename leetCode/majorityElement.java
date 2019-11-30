class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i:nums){
            Integer count = map.get(i);
            count = count == null?1:++count;
            map.put(i,count);
        }
        for(Integer item:map.keySet()){
            Integer count = map.get(item);
            if(count>nums.length/2){
                return item;
            }
        }

        return -1;
        
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
