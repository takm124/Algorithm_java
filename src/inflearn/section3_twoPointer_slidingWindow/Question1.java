package inflearn.section3_twoPointer_slidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 { // 두 배열 합치기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        solution(n, a, m, b);

        /**
         * 3
         * 1 3 5
         * 5
         * 2 3 6 7 9
         */
    }

    private static void solution(int n, int[] a, int m, int[] b) {
        int aPointer = 0;
        int bPointer = 0;
        ArrayList<Integer> answer = new ArrayList<>();

        while (aPointer < n && bPointer < m) {
            if (a[aPointer] < b[bPointer]) {
                answer.add(a[aPointer++]);
            } else {
                answer.add(b[bPointer++]);
            }
        }

        while (aPointer < n) answer.add(a[aPointer++]);
        while (bPointer < m) answer.add(b[bPointer++]);

        for (int i : answer) System.out.print(i + " ");
    }
}
