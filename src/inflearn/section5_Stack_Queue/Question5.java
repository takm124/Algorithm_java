package inflearn.section5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Question5 { // 쇠막대기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(solution(s));

    }


    private static int solution(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push('(');
            } else {
                st.pop();
                if (s.charAt(i - 1) == '(') {
                    ans += st.size();
                } else {
                    ans++;
                }
            }
        }

        return ans;
   }

}
