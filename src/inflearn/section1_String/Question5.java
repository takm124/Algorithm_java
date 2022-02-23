package inflearn.section1_String;

import java.util.Scanner;

public class Question5 { // 특정 문자 뒤집기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s= in.next();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        char[] c = s.toCharArray();
        int lt = 0;
        int rt = s.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(c[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(c[rt])) {
                rt--;
            } else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;

                lt++;
                rt--;
            }
        }

        return String.valueOf(c);
    }
}
