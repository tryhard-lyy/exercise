class Solution {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            ans = ans^nums[i];
        }

        return ans;
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i:nums){
            Integer count = map.get(i);
            count = count == null?1:++count;
            map.put(i,count);
        }
        for(Integer item:map.keySet()){
            Integer count = map.get(item);
            if(count == 1){
                return item;
            }
        }

        return -1;
    }
}
