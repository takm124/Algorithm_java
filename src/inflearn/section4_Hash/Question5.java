package inflearn.section4_Hash;

import java.util.*;

public class Question5 { // K번째 큰수
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
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n1; i++) {
            for (int j = i + 1; j < n1; j++) {
                for (int k = j + 1; k < n1; k++) {
                    set.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }
        int idx = 0;
        for (int i : set) {
            idx++;
            if (idx == n2) return i;
        }

        return -1;
   }
}
