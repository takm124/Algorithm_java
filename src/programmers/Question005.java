package programmers;

import java.util.*;

public class Question005 { // 올바른 괄호
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push('(');
            }
        }

        if (stack.size() != 0) return false;

        return true;
    }
}
