package programmers;

public class Question008 { // 피보나치 수 (int 범위를 벗어날 때)
    public int solution(int n) {
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        }

        return arr[n];
    }
}