package inflearn.section2_Array;

import java.util.Scanner;

public class Question11 { // 임시반장 정하기 // 런타임 에러
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(arr, num));
    }

    private static int solution(int[][] arr, int num) {
        int[] tmp = new int[num];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < num - 1; j++) {
                for (int k = j + 1; k < num; k++) {
                    if (arr[j][i] == arr[k][i]) {
                        tmp[j]++;
                        tmp[k]++;
                    }
                    System.out.println(j + "," + i + " - " + k + "," + i);
                }
            }
        }

        int max = 0;
        int answer = 0;
        for (int i = 0; i < num; i++) {
            max = Math.max(tmp[i], max);
            if (tmp[i] == max) answer = i + 1;
        }

        return answer;
    }
}
