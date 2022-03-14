package inflearn.section5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        Stack<Character> stack = new Stack<>();
        String answer = "";

        for (char c : s.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(') {
                }
            } else {
                stack.push(c);
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }

        return answer;

    }
}
