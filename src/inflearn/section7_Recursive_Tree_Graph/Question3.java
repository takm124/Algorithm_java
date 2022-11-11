package inflearn.section7_Recursive_Tree_Graph;

public class Question3 { // 팩토리얼
    public static void main(String[] args) {
        int N = 5;
        System.out.println(DFS(N));
    }

    public static int DFS(int n) {

        if (n == 1) return 1;

        return n * DFS(n-1);
    }
}
