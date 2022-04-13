package 树;

/**
 * @author CWB
 * @date 2022/4/13
 * @apiNote
 */
public class 将有序数组转换为二叉搜索树108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return traverse(nums,0,nums.length-1);
    }
    TreeNode traverse(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        int mid = start+(end-start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = traverse(nums,start,mid-1);
        root.right = traverse(nums,mid+1,end);
        return root;
    }
}
