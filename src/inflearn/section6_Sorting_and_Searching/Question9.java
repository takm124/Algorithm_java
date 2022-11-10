package inflearn.section6_Sorting_and_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Question9 { // 뮤직비디오(결정 알고리즘) = 이분검색 활용
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

    private static int solution(int[] arr, int len, int n) {
        int ans = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); // 배열의 최댓값 추출
        int rt = Arrays.stream(arr).sum(); // 배열의 합
        while (lt <= rt) {
            int mid = (lt+rt)/2;
            if (count(arr, mid) <= n) {
                ans = mid;
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }

        return ans;
   }

    private static int count(int[] arr, int capacity) {
        int cnt = 1; // dvd 장 수
        int sum = 0; // 곡들의 합

        for (int i : arr) {
            if (sum+i > capacity) {
                cnt++;
                sum = i;
            } else {
                sum += i;
            }
        }

        return cnt;
    }
}
