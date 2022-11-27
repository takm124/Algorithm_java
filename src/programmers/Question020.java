package programmers;

import java.util.*;

public class Question020 { // 괄호 회전하기
    public int solution(String s) {
        int answer = 0;

        Queue<Character> queue = new LinkedList<>();
        for (char c : s.toCharArray()) queue.offer(c);
        for (int i = 0; i < s.length(); i++) {
            if (check(queue)) answer++;
            queue.offer(queue.poll());
        }

        return answer;
    }

    public boolean check(Queue<Character> queue) {
        Queue<Character> tmp = queue;

        Stack<Character> stack = new Stack<>();

        for (char c : tmp) {
            if (!stack.isEmpty()) {
                char peek = stack.peek();
                if (c == ')') {
                    if (peek != '(') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    continue;
                }

                if (c == '}') {
                    if (peek != '{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    continue;
                }

                if (c == ']') {
                    if (peek != '[') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    continue;
                }

                if (c == '(' || c == '{' || c == '[') stack.push(c);
            } else {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) return true;

        return false;
    }
}