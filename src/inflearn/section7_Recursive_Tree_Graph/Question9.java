package inflearn.section7_Recursive_Tree_Graph;

/**
 * Node Class는 section7 - Question5에서 사용한 Node Class 사용
 */

public class Question9 {
    Node root;
    public int DFS(int level, Node root){
        if (root.lt == null && root.rt == null) {
            return level;
        } else {
            return Math.min(DFS(level + 1, root.lt), DFS(level + 1, root.rt));
        }
    }

    public static void main(String[] args) {

        Question9 tree = new Question9();

        //Level 0
        tree.root = new Node(1);

        //Level 1
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);

        //Level 2
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.DFS(0, tree.root));
    }
}
