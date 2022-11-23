package programmers;

public class Question009 { // 다음 큰 숫자
    public int solution(int n) {
        int min = n;
        int minCnt = 0;

        int nCnt = 0;
        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '1') nCnt++;
        }

        while (nCnt != minCnt) {
            minCnt = 0;
            min++;
            for (char c : Integer.toBinaryString(min).toCharArray()) {
                if (c == '1') minCnt++;
            }
        }

        return min;
    }
}
