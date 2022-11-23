package programmers;

import java.util.ArrayList;

public class Question010 { // 카펫
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        // 약수를 구한다
        int total = brown + yellow;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 3; i < total; i++) {
            if (total % i == 0) arr.add(i);
        }

        // 약수끼리 곱해서 total 이 나오는 조합의 수 중, 두 수의 차가 얼마 안나는것
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            int gap = Math.abs(total/i - i);
            if ((total/i -2) * (i - 2) == yellow) { // yellow 타일의 크기를 구하는 것
                min = Math.min(min, gap);
            }
        }

        for (int i : arr) {
            if (Math.abs(total/i - i) == min) {
                answer[0] = Math.max(total/i, i);
                answer[1] = Math.min(total/i, i);
            }
        }

        return answer;
    }
}
