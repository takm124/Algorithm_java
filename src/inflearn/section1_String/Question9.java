package inflearn.section1_String;

import java.util.Scanner;

public class Question9 { // 숫자만 추출
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(solution(s));
    }

    private static int solution(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)) sb.append(c);
        }

        return Integer.valueOf(sb.toString());
    }
}
