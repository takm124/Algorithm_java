package inflearn.section1_String;

import java.util.Scanner;

public class Question10 { // 가장 짧은 문자거리
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.next();
        String s2 = in.next();

        solution(s1, s2);

    }

    private static void solution(String s1, String s2) {
        int[] arr = new int[s1.length()];
        int x = 1000;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                x = 0;
            } else {
                x++;
            }
            arr[i] = x;
        }

        x= 1000;

        for (int i = s1.length() - 1; i >= 0; i--) {
            if (s1.charAt(i) == s2.charAt(0)) {
                x = 0;
            } else {
                x++;
            }
            arr[i] = Math.min(arr[i], x);
        }


        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
