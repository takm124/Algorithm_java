package inflearn.section7_Recursive_Tree_Graph;

public class Question2 {

    public void Recursive(int n) {
        if (n == 0) {
           return;
        } else {
            Recursive(n / 2);
            System.out.print(n % 2 + "");
        }
    }

    public static void main(String[] args) {
        Question2 q = new Question2();
        q.Recursive(11); //1011
    }
}
