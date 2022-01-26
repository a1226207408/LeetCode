package array;

import java.util.ArrayList;
import java.util.List;

public class 杨辉三角II119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> tl = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    tl.add(1);
                } else {
                    tl.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(tl);
        }
        return list.get(list.size() - 1);
    }

}
