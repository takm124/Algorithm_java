package inflearn.section5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if(!stack.isEmpty()) return "NO";

        return "YES";
    }
}
