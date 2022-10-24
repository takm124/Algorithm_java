package inflearn.section1_String;

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
        arr = arr.toLowerCase();
        c = c.toLowerCase();

        int answer = 0;

        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == c.charAt(0)) answer++;
        }

        return answer;
    }
}
