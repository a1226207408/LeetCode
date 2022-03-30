package 树;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CWB
 * @date 2022/3/30
 * @apiNote
 */
public class 根据前序和后序遍历构造二叉树889 {
    Map<Integer, Integer> valToIndex = new HashMap<>();

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for (int i = 0; i < postorder.length; i++) {
            valToIndex.put(postorder[i], i);
        }
        return build(preorder, 0, preorder.length - 1,
                postorder, 0, postorder.length - 1);
    }

    private TreeNode build(int[] preorder, int preStart, int preEnd,
                           int[] postorder, int postStart, int postEnd) {
        if (preStart > preEnd) {
            return null;
        }
        if (preStart == preEnd) {
            return new TreeNode(preorder[preStart]);
        }
        //确定根节点
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        //确定左右范围
        //指定前序中根节点后一位为左树
        int leftVal = preorder[preStart + 1];
        int postLeftEnd = valToIndex.get(leftVal);
        int leftSize = postLeftEnd - postStart + 1;
        //递归处理
        root.left = build(preorder, preStart + 1, preStart + leftSize,
                postorder, postStart, postLeftEnd);
        root.right = build(preorder, preStart + leftSize + 1, preEnd,
                postorder, postLeftEnd + 1, postEnd - 1);
        return root;
    }
}
