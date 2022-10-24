package inflearn.section1_String;

import java.util.Scanner;

public class Question3 { // 문장 속 단어
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String[] tmp = s.split(" ");
        int max = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i].length() > max) {
                max = tmp[i].length();
                s = tmp[i];
            }
        }

        return s;
    }
}
