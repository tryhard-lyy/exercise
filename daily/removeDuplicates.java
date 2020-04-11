public class removeDuplicates {
    public static int remove(int[] nums){
        int len = nums.length;
        int i = 0;
        for(int j = 1;j<len;j++){
            while (nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        
        return i+1;
    }
}
