package inflearn.section6_Sorting_and_Searching;

import java.util.*;

public class Question6 { // 장난꾸러기 = 정렬되지 않은 인덱스 찾기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        solution(arr, n);
    }


    private static void solution(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        for (int i = 0; i < n; i++) {
            if (tmp[i] != arr[i]) ans.add(i+1);
        }

        for (int i : ans) {
            System.out.print(i + " ");
        }
   }
}
