package inflearn.section7_Recursive_Tree_Graph;

public class Question3 {
    public static int Recursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * Recursive(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Recursive(5));
    }
}
