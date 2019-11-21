class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
      int right = nums.length - 1;
      int mid = 0;
      if((mid = BinarySearch(nums,left,right,target))!=-1){
          int prve = mid,post = mid,last_prve = prve,last_post = post;

          while(prve!=-1){
              last_prve = prve;
              prve = BinarySearch(nums,left,prve-1,target);
          }

          while(post!=-1){
              last_post = post;
              post = BinarySearch(nums,post+1,right,target);
          }

          return new int[]{last_prve,last_post};
      }else{
          return new int[]{-1,-1};
      }

  }

  public static int BinarySearch(int[] nums,int left,int right,int target){
      while(left <= right){
          int mid = (left+right)/2;
          if(nums[mid] == target){
              return mid;
          }else if(nums[mid] > target){
              right = mid - 1;
          }else if(nums[mid] < target){
              left = mid + 1;
          }
      }

      return -1;
  }
}
