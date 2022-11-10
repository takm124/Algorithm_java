package inflearn.section6_Sorting_and_Searching;

import java.util.Scanner;

public class Question1 { // 선택정렬
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

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        return arr;
   }

}
