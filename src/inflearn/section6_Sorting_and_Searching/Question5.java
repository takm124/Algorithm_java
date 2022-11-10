package inflearn.section6_Sorting_and_Searching;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question5 { // 중복 확인
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(arr, n));
    }


    private static String solution(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) set.add(i);
        if (set.size() != n) return "D";
        
        return "U";

   }
}
