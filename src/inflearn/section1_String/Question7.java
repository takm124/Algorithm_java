package inflearn.section1_String;

import java.util.Scanner;

public class Question7 { // 회문문자열
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder(s);

        if (sb.reverse().toString().equals(s)) {
            return "YES";
        }
        return "NO";
    }
}
