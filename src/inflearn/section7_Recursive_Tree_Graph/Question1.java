package inflearn.section7_Recursive_Tree_Graph;

public class Question1 {
    public void Recursive(int n) {
        if (n == 0) {
            return;
        } else {
            // System.out.println(n); 3, 2, 1 출력
            Recursive(n - 1);
            // System.out.println(n); 1, 2, 3 출력
        }
    }

    public static void main(String[] args) {
        Question1 q = new Question1();
        q.Recursive(3);

        /**
         * Recursive 메소드를 실행하면 stack frame이 생긴다.
         * stack frame에는 매개변수, 지역변수, 복귀할 주소등이 저장되어 있다.
         * Recursive(3)을 호출하면 중간에 Recursive(2)가 호출되며 새로운 stack frame이 생성된다.
         */
    }
}
