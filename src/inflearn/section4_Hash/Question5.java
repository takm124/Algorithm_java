package inflearn.section4_Hash;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Question5 { // K번째 큰 수
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = in.nextInt();
        }

        solution(n1, n2, arr);
    }

    private static void solution(int n1, int n2, int[] arr) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n1; i++) {
            for (int j = i + 1; j < n1; j++) {
                for (int k = j + 1; k < n1; k++) {
                    Tset.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }
        int cnt = 0;
        for (int x : Tset) {
            cnt++;
            if (cnt == n2) answer = x;
        }

        System.out.println(answer);
    }
}
