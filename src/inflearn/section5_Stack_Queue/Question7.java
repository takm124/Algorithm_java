package inflearn.section5_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question7 { // 교육과정 설계
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        System.out.println(solution(s1, s2));
    }
    private static String solution(String s1, String s2) {
        int idx = 0;
        Queue<Character> queue = new LinkedList<>();
        for (char c : s2.toCharArray()) {
            queue.offer(c);
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = queue.poll();
            if (s1. indexOf(c) >= 0) { // character가 s1에 포함될 떄
                if (s1.indexOf(c) != idx) { //idx가 같은가
                    return "NO";
                } else {
                    idx++;
                }
            }
        }

        if (idx != s1.length()) return "NO";

        return "YES";
   }

}
