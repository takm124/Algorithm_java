package programmers;

public class Question015 { // 예상 대진표
    public int solution(int n, int a, int b) {
        int round = 1;
        double A = a;
        double B = b;
        while (A != B) {
            A = Math.round(A/2);
            B = Math.round(B/2);
            if (A == B) {
                return round;
            } else {
                round++;
            }
        }
        return round;
    }
}

