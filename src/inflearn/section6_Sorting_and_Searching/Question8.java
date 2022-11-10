package inflearn.section6_Sorting_and_Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question8 { // 이분검색
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n2 = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(arr, n, n2));
    }

    private static int solution(int[] arr, int n, int n2) {
        int answer = 0;
        Arrays.sort(arr);
        int lp = 0;
        int rp = n - 1;

        while (lp <= rp) {
            int mid = (lp + rp) / 2;

            if (arr[mid] == n2) {
                answer = mid + 1;
                break;
            }

            if (arr[mid] > n2) {
                rp = mid - 1;
            } else {
                lp = mid + 1;
            }

            answer = arr[mid];
        }
        return answer;
   }
}
