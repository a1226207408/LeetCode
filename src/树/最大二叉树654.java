package 树;

import org.junit.jupiter.api.Test;

/**
 * @author CWB
 * @date 2022/3/30
 * @apiNote
 */
public class 最大二叉树654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        //确定最大值
        int maxVal = nums[left];
        int index = left;
        for (int i = left; i <= right; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                index = i;
            }
        }
        //构建根节点
        TreeNode root = new TreeNode(maxVal);
        //确定左右子树边界，递归处理左子树、右子树
        root.left = build(nums, left, index - 1);
        root.right = build(nums, index + 1, right);
        return root;
    }

    @Test
    void test() {
        int[] nums = {3, 2, 1, 6, 0, 5};
        TreeNode treeNode = constructMaximumBinaryTree(nums);
    }
}
