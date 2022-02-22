package inflearn.section1_String;

import java.util.Locale;
import java.util.Scanner;

public class Question1 { // 문자 찾기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String arr = in.next();
        String c = in.next();

        int answer = solution1(arr, c);
        System.out.println(answer);
    }

    private static int solution1(String arr, String c) {
        int answer = 0;
        arr = arr.toLowerCase();
        c = c.toLowerCase();
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == c.charAt(0)) answer++;
        }

        return answer;
    }
}
