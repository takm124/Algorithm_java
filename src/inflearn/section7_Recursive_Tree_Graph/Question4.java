package inflearn.section7_Recursive_Tree_Graph;

public class Question4 { // 피보나치 수열
    static int[] fibo;
    public static void main(String[] args) {
        int N = 7;
        fibo = new int[N+1];
        DFS(N); //1 1 2 3 5 8 13

        for (int i : fibo) {
            System.out.print(i + " ");
        }
    }

    public static int DFS(int n) {
        if (fibo[n] > 0) return fibo[n];
        if (n == 1 || n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n-2) + DFS(n-1);
        }


    }
}
