package inflearn.section3_twoPointer_slidingWindow;

import java.util.Scanner;

public class Question4 { // 연속 부분수열
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

    //8 6
    //1 2 1 3 1 1 1 2

    private static int solution(int[] arr, int n1, int n2) {
        int cnt = 0;
        int lp = 0;
        int sum = 0;

        for (int rp = 0; rp < n1; rp++) {
            sum += arr[rp];
            if (sum == n2) cnt++;

            while (sum >= n2) {
                sum -= arr[lp++];
                if(sum == n2) cnt++;
            }
        }

        return cnt;
   }
}
