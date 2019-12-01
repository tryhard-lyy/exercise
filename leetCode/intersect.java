class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer item:nums1){
            map.put(item,map.getOrDefault(item,0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(Integer item : nums2){
            if(map.containsKey(item)&&map.get(item)>0){
                list.add(item);
                map.put(item,map.get(item)-1);
            }
            
        }

        int[] arr = new int[list.size()];
         int i = 0;
        for(Integer item:list){
           
            arr[i] = list.get(i);
            i++;
        }

        return arr;
    }
}
