package 栈;

import java.util.Stack;

public class 有效的括号20 {

    public static void main(String[] args) {
        String s = "}";
        System.out.println(isValid(s));
    }


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (bracket == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (bracket == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
