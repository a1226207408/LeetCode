package 栈;

import java.util.Stack;

public class 最小栈155 {

    /**
     * initialize your data structure here.
     */
//   思路：辅助栈存储最小值
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public 最小栈155() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        最小栈155 s = new 最小栈155();
        s.push(2);
        s.push(0);
        s.push(3);
        s.push(0);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
    }
}
