package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class Valid_Parentheses_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

        if (s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')') return false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) return false;

                if (map.get(stack.pop()) != s.charAt(i)) {
                    return false;
                }
            }
        }

        if(!stack.isEmpty()) return false;

        return true;
    }
}
