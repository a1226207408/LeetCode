package 树;

/**
 * @author CWB
 * @date 2022/3/29
 * @apiNote
 */
public class 填充每个节点的下一个右侧节点指针116 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        tarverse(root.left, root.right);
        return root;
    }

    private void tarverse(Node node1, Node node2) {
        if (node1 == null) {
            return;
        }
        node1.next = node2;
        tarverse(node1.left, node1.right);
        tarverse(node2.left, node2.right);
        tarverse(node1.right, node2.left);
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
