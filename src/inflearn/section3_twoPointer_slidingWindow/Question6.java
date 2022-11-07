package inflearn.section3_twoPointer_slidingWindow;

import java.util.Scanner;

public class Question6 { // 최대길이 연속 부분수열
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int[] arr = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(arr, n1, n2));
    }

    private static int solution(int[] arr, int n1, int n2) {
        int ans = 0;
        int cnt = 0;
        int lp = 0;
        for (int rp = 0; rp < n1; rp++) {
            if (arr[rp] == 0) cnt++;
            while (cnt > n2) {
                if (arr[lp] == 0) cnt--;
                lp++;
            }
            ans = Math.max(ans, rp - lp + 1);
        }
        return ans;
   }
}
