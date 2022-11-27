package programmers;

import java.util.Arrays;

public class Question018 { // H-index
    public static void main(String[] args) {
        int[] ar = {3, 0, 6, 1, 5};
        System.out.println(solution(ar));;
    }

    public static  int solution(int[] arr) {
        int ans = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= arr.length - i) {
                ans = arr.length - i;
                break;
            }
        }

        return ans;
    }
}

