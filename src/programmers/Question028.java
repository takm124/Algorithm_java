package programmers;

public class Question028 { // 타겟넘버
    int ch[];
    int t, c = 0; // target number, count


    public int solution(int[] numbers, int target) {
        ch = new int[numbers.length];
        t = target;
        DFS(0, numbers);
        return c;
    }

    public void DFS(int L, int[] numbers) {
        if (numbers.length == L) {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (ch[i] == 1) {
                    sum += numbers[i];
                } else {
                    sum -= numbers[i];
                }
            }
            if (sum == t) c++;
        } else {
            ch[L] = 1;
            DFS(L+1, numbers);
            ch[L] = 0;
            DFS(L+1, numbers);
        }
    }
}
