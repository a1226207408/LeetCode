package 队列;

import java.util.Stack;

public class 有效的括号20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (stack.size() > 0) {
                char t = stack.pop();
                switch (t) {
                    case '{':
                        if (c != '}') return false;
                        break;
                    case '[':
                        if (c != ']') return false;
                        break;
                    case '(':
                        if (c != ')') return false;
                        break;
                }
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }
}
