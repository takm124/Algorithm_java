package inflearn.section3_twoPointer_slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question2 { // 공통원소구하기
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

    }

    private static void solution(int n, int[] a, int m, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int arr1 = 0;
        int arr2 = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        while (arr1 < n && arr2 < m) {
            if (a[arr1] < b[arr2]) {
                arr1++;
            } else if (a[arr1] > b[arr2]) {
                arr2++;
            } else {
                answer.add(a[arr1]);
                arr1++;
                arr2++;
            }
        }

        for (int i : answer) System.out.print(i + " ");

    }
}
