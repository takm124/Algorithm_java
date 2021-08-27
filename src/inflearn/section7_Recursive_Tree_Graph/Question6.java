package inflearn.section7_Recursive_Tree_Graph;

public class Question6 {
    static int n;
    static int[] check;
    public void DFS(int L) {
        if (L == n + 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= n; i++) {
                if (check[i] == 1) {
                    sb.append(i+" ");
                }
            }
            if (sb.length() > 0) System.out.println(sb);
        } else {
            check[L] = 1; // 부분집합으로 사용함
            DFS(L+1); // 왼쪽으로

            check[L] = 0; // 부분집합으로 사용하지 않음
            DFS(L+1); // 오른쪽으로
        }
    }

    public static void main(String[] args) {
        Question6 q = new Question6();
        n = 3;
        check = new int[n + 1];
        q.DFS(1);
    }
}
