package 树;

/**
 * @author CWB
 * @date 2022/4/19
 * @apiNote
 */
public class 验证二叉树的前序序列化331 {
    public boolean isValidSerialization(String preorder) {
        int edge = 1;
        for(String node:preorder.split(",")){
            edge--;
            if(edge < 0)
                return false;
            if(!node.equals("#")){
                edge += 2;
            }

        }
        return edge==0;
    }
}
