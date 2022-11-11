package inflearn.section7_Recursive_Tree_Graph;

public class Question1 { // 재귀함수
    public static void main(String[] args) {
        // 자연수 N이 입력되었을때 1부터 N까지 출력하는 함수
        int N = 10;
        recursive(N);
    }

    public static void recursive(int n) {
        if (n == 0) {
            return;
        } else {
            recursive(n-1);
            System.out.println(n);
        }
    }
}
