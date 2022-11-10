package inflearn.section6_Sorting_and_Searching;

import java.util.ArrayList;
import java.util.Scanner;

public class Question4 { // LRU
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n2 = in.nextInt();
        int[] arr = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr[i] = in.nextInt();
        }

        for (int i : solution(arr, n, n2)) {
            System.out.print(i + " ");
        }
    }


    private static ArrayList<Integer> solution(int[] arr, int n1, int n2) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            if (ans.size() < n1) { // cache가 꽉 차지 않았을 때
                if (!ans.contains(arr[i])) { // cache에 값이 없다면
                    ans.add(0, arr[i]);
                } else { // cache에 이미 값이 존재하면
                    // 기존에 존재하는 값 지워주고 0번자리에 삽입
                    ans.remove(ans.indexOf(arr[i]));
                    ans.add(0, arr[i]);
                }
            } else { // cache가 꽉 차있는 경우
                if (!ans.contains(arr[i])) { // cache에 값이 없다면
                    // (cache 크기 - 1)번자리 값 제거후 0번에 삽입
                    ans.remove(n1 - 1);
                    ans.add(0, arr[i]);
                } else { //cache에 이미 있는 값이라면
                    // 기존에 존재하는 값 지워주고 0번자리에 삽입
                    ans.remove(ans.indexOf(arr[i]));
                    ans.add(0, arr[i]);
                }
            }
        }
        return ans;
   }
}
