package inflearn.section3_twoPointer_slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question2 { // 공통 원소 구하기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int[] arr1 = new int[num1];

        for (int i = 0; i < num1; i++) {
            arr1[i] = in.nextInt();
        }

        int num2 = in.nextInt();
        int[] arr2 = new int[num2];

        for (int i = 0; i < num2; i++) {
            arr2[i] = in.nextInt();
        }


        for (int i : solution(arr1, arr2)) {
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int pt1 = 0, pt2 = 0;

        while (pt1 < arr1.length && pt2 < arr2.length) {
            if (arr1[pt1] == arr2[pt2]) {
                ans.add(arr1[pt1]);
                pt1++;
                pt2++;
            } else if (arr1[pt1] < arr2[pt2]) {
                pt1++;
            } else {
                pt2++;
            }
        }

        return ans;
   }
}
