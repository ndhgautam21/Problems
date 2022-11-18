package easy;

import java.util.Stack;

public class ValidParentheses {

    public static char oppositeChar(char ch) {
        switch (ch) {
            case ')': return '(';
            case ']': return '[';
            case '}': return '{';
            default: return '!';
        }
    }
    public static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') stack.push(ch);
            else if (stack.isEmpty() || stack.pop() != oppositeChar(ch)) return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String testCase1 = "[]}";
        String testCase2 = "{[()][]}[]{{[()]}}{}";
        System.out.println(validParentheses(testCase1));
    }
}
