package programmers;

public class Question016 { // 점프와 순간 이동
    public static void main(String[] args) {
        System.out.println(solution(5000));
    }

    public static int solution(int n) {
        int cnt = 0;
        while (n != 0) {
            if (n % 2 == 1) cnt++;
            n /= 2;
        }
        return cnt;
    }
}

