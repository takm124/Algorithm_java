package etc;

public class N_Queen { // backtracking algorithm
    public static int ans;
    public static int[] arr;
    public static int num;

    public int solution(int n) {
        num = n;
        arr = new int[n];
        DFS(0);
        return ans;
    }

    public void DFS(int L) {
        if (L == num) {
            ans++;
            return;
        }

        for (int i = 0; i < num; i++) {
            arr[L] = i;
            if (check(L)) {
                DFS(L+1);
            }
        }
    }

    public boolean check(int L) {
        for (int i = 0; i < L; i++) {
            if (arr[i] == arr[L]) { // 행 체크
                return false;
            } else if (Math.abs(L - i) == Math.abs(arr[L] - arr[i])) { // 대각선 체크
                return false;
            }
        }
        return true;
    }
}
