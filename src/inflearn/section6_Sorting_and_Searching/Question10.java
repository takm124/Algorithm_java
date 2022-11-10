package inflearn.section6_Sorting_and_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Question10 { // 마구간(결정 알고리즘)
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

    private static int solution(int[] arr, int n, int m) {
        int ans = 0;
        int lt = 1; // 최소거리
        int rt = arr[n-1]; // 최대거리
        Arrays.sort(arr);

        while (lt <= rt) {
            int mid = (lt+rt)/2;
            if(count(arr, mid) >= m) {
                ans = mid;
                lt = mid+1;
            } else {
                rt = mid-1;
            }

        }
        return ans;
   }

    private static int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]-ep >=dist) {
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;
    }
}
