package inflearn.section5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Question4 { // 후위식 연산
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(solution(s));

    }


    private static int solution(String s) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                st.push(c - 48);
            } else {
                int lp = st.pop();
                int rp = st.pop();

                if (c == '+') st.push(rp + lp);
                else if(c == '-') st.push(rp - lp);
                else if(c == '*') st.push(rp * lp);
                else if(c == '/') st.push (rp/lp);
            }
        }

        return st.pop();
   }

}
