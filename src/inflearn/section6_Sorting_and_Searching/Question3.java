package inflearn.section6_Sorting_and_Searching;

import java.util.Scanner;

public class Question3 { // 삽입정렬
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i : solution(arr, n)) {
            System.out.print(i + " ");
        }
    }


    private static int[] solution(int[] arr, int n) {

        for (int i = 1; i < n; i++) {
            int tmp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;

        }
        return arr;
   }
}
