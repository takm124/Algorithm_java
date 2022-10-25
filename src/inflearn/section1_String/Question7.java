package inflearn.section1_String;

import java.util.Scanner;

public class Question7 { // 회문 문자열
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        s = s.toUpperCase();

        int lt = 0;
        int rt = s.length() - 1;

        while (lt < rt) {
            if (s.charAt(lt) != s.charAt(rt)) {
                return "NO";
            } else {
                lt++;
                rt--;
            }
        }

        return "YES";
    }
}
