package inflearn.section3_twoPointer_slidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 { // 두 배열 합치기
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

    private static List<Integer> solution(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<>();
        int pt1 = 0, pt2 = 0;

        while (pt1 < arr1.length && pt2 < arr2.length) {
            if (arr1[pt1] <= arr2[pt2]) {
                ans.add(arr1[pt1++]);
            } else {
                ans.add(arr2[pt2++]);
            }
        }

        if (pt1 != arr1.length) {
            for (int i = pt1; i < arr1.length; i++) {
                ans.add(arr1[i]);
            }

            return ans;
        }

        if (pt2 != arr2.length) {
            for (int i = pt2; i < arr2.length; i++) {
                ans.add(arr2[i]);
            }

            return ans;
        }
        return ans;
   }
}
