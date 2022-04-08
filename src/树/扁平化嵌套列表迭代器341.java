package 树;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author CWB
 * @date 2022/4/8
 * @apiNote
 */
public class 扁平化嵌套列表迭代器341 {
    class NestedIterator implements Iterator<Integer> {
        LinkedList<NestedInteger> list;

        public NestedIterator(List<NestedInteger> nestedList) {
            list = new LinkedList<>(nestedList);
        }

        @Override
        public Integer next() {
            return list.remove(0).getInteger();
        }

        @Override
        public boolean hasNext() {
            //保证如果list不为空，next一定是Integer
            while (!list.isEmpty() && !list.get(0).isInteger()) {
                List<NestedInteger> first = list.remove(0).getList();
                for (int i = first.size() - 1; i >= 0; i--) {
                    list.addFirst(first.get(i));
                }
            }
            return !list.isEmpty();
        }
    }
}

interface NestedInteger {

    public boolean isInteger();

    public Integer getInteger();

    public List<NestedInteger> getList();
}