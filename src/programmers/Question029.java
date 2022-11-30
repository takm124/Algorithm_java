package programmers;

public class Question029 { // K진수에서 소수 개수 구하기
    public static void main(String[] args) {
        solution(437674, 3);
    }

    public static int solution(int n, int k) { // 양의 정수 n, k진수로 바꿈
        String s = Integer.toString(n, k);
        String[] arr = s.split("0");
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isEmpty()) {
                if (isPrime(arr[i])) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static boolean isPrime(String s) {
        long n = Long.parseLong(s);
        if (n < 2) return false;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
