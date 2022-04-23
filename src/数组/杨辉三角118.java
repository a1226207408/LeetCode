package 数组;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class 杨辉三角118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            List<Integer> tl = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(j==0 || j==i){
                    tl.add(1);
                }else{
                    tl.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(tl);
        }
        return list;
    }

    @Test
    public void test(){
        List<List<Integer>> l = generate(5);
        System.out.println(l);
    }
}
