package inflearn.section7_Recursive_Tree_Graph;

public class Question2 { // 2진수 출력
    public static void main(String[] args) {
        int N = 10;
        DFS(N);
    }

    public static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n/2);
            System.out.print(n%2 + "");
        }
    }
}
