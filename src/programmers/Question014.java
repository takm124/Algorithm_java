package programmers;

public class Question014 { // N개의 최소 공배수
    public int solution(int[] arr) {
        int lcm = 0;
        int tmp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            tmp = (tmp * arr[i]) / eucd(tmp, arr[i]);
            lcm = Math.max(lcm, tmp);
        }
        return lcm;
    }

    public static int eucd(int a, int b) {
        int gcd = 1;
        if (a > b) {
            for (int i = 2; i <= b; i++) {
                if (a % i == 0 && b % i == 0) gcd = i;
            }
        } else {
            for (int i = 2; i <= a; i++) {
                if (a % i == 0 && b % i == 0) gcd = i;
            }
        }
            return gcd;
    }
}

