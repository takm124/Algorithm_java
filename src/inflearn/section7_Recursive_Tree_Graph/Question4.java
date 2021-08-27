package inflearn.section7_Recursive_Tree_Graph;

public class Question4 {
    static int[] fibo;

    public int DFS(int n) { //n이 커지면 성능이 나빠짐
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return DFS(n - 2) + DFS(n - 1);
        }
    }

    public int DFS2(int n) { //배열을 사용한 피보나치 수열
        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }

    public int DFS3(int n) { //성능 더 높이기 - 메모이제이션
        if(fibo[n] > 0) return fibo[n];

        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        Question4 q = new Question4();
        int n = 5;
        System.out.println(q.DFS(n)); //n번째 항을 구함

        /**
         * DFS(5)를 호출했을 때 내부 사이클
         * DFS(5) = DFS(3) + DFS(4)
         * DFS(4) = DFS(2) + DFS(3)
         * DFS(3) = DFS(1) + DFS(2)
         *
         * DFS(5) = (DFS(1) + DFS(2)) + (DFS(1) + DFS(2) + DFS(2))
         */

        for (int i = 1; i <= n; i++) {
            System.out.print(q.DFS(i) + " "); //n = 5 , 1 1 2 3 5
        }

        System.out.println();
        /**
         * 재귀의 성능을 높이기 위한 방법
         * 배열을 만들어 이미 구한 값을 그대로 이용하기
         */
        fibo = new int[n + 1];
        q.DFS2(5);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }

        /**
         * 재귀보다 for 문으로 구현하는 것이 성능은 훨씬 좋다
         * 재귀는 stack frame이 계속 생겨서 메모리 낭비가 생기지만 for 문은 메모리를 많이 잡아먹지 않는다.
         */
    }

}
