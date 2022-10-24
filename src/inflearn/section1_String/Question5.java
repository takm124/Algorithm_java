package inflearn.section1_String;

import java.util.Scanner;

public class Question5 { // 특정 문자 뒤집기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        char[] arr = s.toCharArray();

        int lt = 0;
        int rt = s.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            }

            if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            }

            if (Character.isAlphabetic(arr[lt]) && Character.isAlphabetic(arr[rt])) {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(arr);
    }
}
