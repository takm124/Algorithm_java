package inflearn.section6_Sorting_and_Searching;

import java.util.Scanner;

public class Question2 { // 버블정렬
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
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) swap(j+1, j, arr);
            }
        }
        return arr;
   }

   private static void swap(int a, int b, int[] arr) {
       int tmp = arr[a];
       arr[a] = arr[b];
       arr[b] = tmp;
   }
}
