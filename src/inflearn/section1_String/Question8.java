package inflearn.section1_String;

import java.util.Locale;
import java.util.Scanner;

public class Question8 { // 유효한 펠린드롬
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String tmp = "";
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                tmp += c;
            }
        }

        // s.toLowerCase().replaceAll("[^A-Z]", ""); 정규식 활용

        tmp = tmp.toLowerCase();

        StringBuilder sb = new StringBuilder(tmp);

        if (sb.reverse().toString().equals(tmp)) {
            return "YES";
        }

        return "NO";
    }
}
