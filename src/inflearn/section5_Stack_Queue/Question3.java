package inflearn.section5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Question3 { // 크레인 인형뽑기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int n = in.nextInt();
        int[] tries = new int[n];
        for (int i = 0; i < n; i++) {
            tries[i] = in.nextInt();
        }


        System.out.println(solution(size, arr, tries));

    }

    private static int solution(int size, int[][] arr, int[] tries) {
        Stack<Integer> st = new Stack<>();
        int cnt = 0;

        for (int i = 0; i < tries.length; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[j][tries[i] - 1] != 0) {
                    if (st.isEmpty()) {
                        st.push(arr[j][tries[i] - 1]);
                    } else {
                        if (st.peek() == arr[j][tries[i] - 1]) {
                            st.pop();
                            cnt += 2;
                        } else {
                            st.push(arr[j][tries[i] - 1]);
                        }
                    }

                    arr[j][tries[i] - 1] = 0;
                    break;
                }
            }
        }
        return cnt;
   }

}
