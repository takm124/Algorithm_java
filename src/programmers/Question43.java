package programmers;

import java.util.*;

public class Question43 { // 뒤에 있는 큰 수 찾기
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] ans = new int[len];
        Stack<Integer> stack = new Stack<>();

        Arrays.fill(ans, -1);

        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && numbers[i] > numbers[stack.peek()]) {
                int tmp = stack.pop();
                ans[tmp] = numbers[i];
            }

            stack.push(i);
        }

        return ans;
    }
}
