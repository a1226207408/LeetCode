package 树;

import java.util.LinkedList;

/**
 * @author CWB
 * @date 2022/4/18
 * @apiNote
 */
public class 填充每个节点的下一个右侧节点指针II117 {
    //层序遍历
    public Node connect(Node root) {
        LinkedList<Node> q = new LinkedList<>();
        if(root!=null)
            q.add(root);
        while(!q.isEmpty()){
            int sz = q.size();
            Node pre =null;
            for(int i=0;i<sz;i++){
                Node node = q.pop();
                if(pre !=null){
                    pre.next = node;
                }
                pre = node;
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
        }
        return root;
    }
}
