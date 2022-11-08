package inflearn.section5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Question1 { // 올바른 괄호
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(solution(s));

    }

    private static String solution(String s) {
        Stack<Character> st = new Stack<>();

        if (s.charAt(0) == ')') {
            return "NO";
        }else {
            st.push(s.charAt(0));
        }


        for (int i = 1; i < s.length(); i++) {
            if (!st.isEmpty()) {
                if (st.peek() == '(' && s.charAt(i) == ')') {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            } else {
                if (s.charAt(i) == ')') {
                    return "NO";
                } else {
                    st.push(s.charAt(i));
                }
            }
        }

        if (st.size() != 0) return "NO";

        return "YES";
   }
}
