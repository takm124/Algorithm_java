package inflearn.section1_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question6 { // 중복 문자 제거
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        char[] arr = s.toCharArray();
        List<Character> answer = new ArrayList<>();

        for (char c : arr) {
            if (!answer.contains(c)) answer.add(c);
        }

        StringBuilder sb = new StringBuilder();

        for (Character character : answer) {
            sb.append(character);
        }

        return sb.toString();
    }

    /**
     * s.indexOf(s.charAt(i)) == i) 의 의미는
     * String의 i번째 character가 처음 등장하는 것인지 확인하는 구문
     */
    private static String solution2(String s) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == i) answer += s.charAt(i);
        }

        return answer;
    }
}
