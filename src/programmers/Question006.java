package programmers;

public class Question006 { // 이진 변환 반복하기
    public int[] solution(String s) {
        int[] answer = new int[2];
        int data = 0;
        int zeroCount = 0;
        int totalCount = 0;

        while (data != 1) {
            int tmp = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') tmp++;
            }

            s = Integer.toBinaryString(s.length() - tmp);

            data = Integer.parseInt(s, 2);

            zeroCount += tmp;
            totalCount++;
        }

        answer[0] = totalCount;
        answer[1] = zeroCount;

        return answer;
    }
}
