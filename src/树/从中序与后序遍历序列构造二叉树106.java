package 树;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CWB
 * @date 2022/3/30
 * @apiNote
 */
public class 从中序与后序遍历序列构造二叉树106 {
    Map<Integer, Integer> valToIndex = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            valToIndex.put(inorder[i], i);
        }
        return build(postorder, 0, postorder.length - 1,
                inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] postorder, int postStart, int postEnd,
                           int[] inorder, int inStart, int inEnd) {
        if (postStart > postEnd) {
            return null;
        }
        //构建根节点
        int rootVal = postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);
        //确定左右子树范围
        int index = valToIndex.get(rootVal);
        int leftSize = index - inStart;
        //递归处理
        root.left = build(postorder, postStart, postStart + leftSize - 1,
                inorder, inStart, index - 1);
        root.right = build(postorder, postStart + leftSize, postEnd - 1,
                inorder, index + 1, inEnd);
        return root;
    }

    @Test
    void test() {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        buildTree(inorder, postorder);
    }
}
