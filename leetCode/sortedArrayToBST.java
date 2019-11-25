/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length <= 0){
            return null;
        }

        return TosortedArrayToBST(nums,0,nums.length-1);
    }

    public TreeNode TosortedArrayToBST(int[] nums,int start,int end){
        if(start <= end){
            int mid = (start + end)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = TosortedArrayToBST(nums,start,mid-1);
            root.right = TosortedArrayToBST(nums,mid+1,end);

            return root;
        }else{
            return null;
        }
    }
    
}
