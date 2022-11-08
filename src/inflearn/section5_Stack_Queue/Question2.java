package inflearn.section5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Question2 { // 괄호 문자 제거
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(solution(s));

    }

    //(A(BC)D)EF(G(H)(IJ)K)LM(N)

    private static String solution(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(c);
            } else if (c == ')'){
                if (st.peek() == '(') {
                    st.pop();
                }
            } else {
                if (st.isEmpty()) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
   }

}
