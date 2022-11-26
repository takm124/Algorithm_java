package programmers;

public class Question017 { //멀리 뛰기
    public long solution(int n) {
        long[] fi = new long[2001];
        fi[1] = 1;
        fi[2] = 2;

        for (int i = 3; i <= n; i++) {
            fi[i] = (fi[i-1] + fi[i-2]) % 1234567;
        }

        return fi[n];
    }
}

