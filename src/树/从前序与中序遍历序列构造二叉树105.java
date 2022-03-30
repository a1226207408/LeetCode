package 树;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CWB
 * @date 2022/3/30
 * @apiNote
 */
public class 从前序与中序遍历序列构造二叉树105 {
    Map<Integer, Integer> valToIndex = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            valToIndex.put(inorder[i], i);
        }
        return build(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1);

    }

    private TreeNode build(int[] preorder, int preStart, int preEnd,
                           int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }

        //构建根节点
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        //确定左右子树下标范围
        int index = valToIndex.get(rootVal);
        int leftSize = index - inStart;
        root.left = build(preorder, preStart + 1, preStart + leftSize,
                inorder, inStart, index - 1);
        root.right = build(preorder, preStart + leftSize + 1, preEnd,
                inorder, index + 1, inEnd);
        return root;
    }
}
