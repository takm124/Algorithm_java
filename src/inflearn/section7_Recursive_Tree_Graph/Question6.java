package inflearn.section7_Recursive_Tree_Graph;

public class Question6 { // 부분집합 구하기(DFS)
    static int n;
    static int[] ch;

    public static void main(String[] args) {
        n = 3;
        ch = new int[n+1];
        DFS(1);
    }

    public static void DFS(int L) {
        if (L == n+1) { // 종착역인 경우
            for (int i = 1; i < n+1; i++) {
                if (ch[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            ch[L] = 1; // 원소로 사용 한다
            DFS(L+1);
            ch[L] = 0; // 원소로 사용하지 않는다.
            DFS(L+1);
        }

    }
}
