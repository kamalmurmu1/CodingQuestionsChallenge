package NeetCode.validate_parentheses;

import java.util.Stack;

// https://neetcode.io/problems/validate-parentheses/question
public class ValidateParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && (top != '(')) {
                    return false;
                }
                if (c == ']' && (top != '[')) {
                    return false;
                }
                if (c == '}' && (top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidateParentheses validateParentheses = new ValidateParentheses();
        String s = "[(])";
        System.out.println(validateParentheses.isValid(s));
    }
}
