package inflearn.section7_Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Question10 {
    Node root;
    public int BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int level = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node x = Q.poll();
                if (x.lt == null && x.rt == null) return level;

                if (x.lt != null) Q.offer(x.lt);
                if (x.rt != null) Q.offer(x.rt);
            }
            level++;
        }

        return 0;
    }

    public static void main(String[] args) {

        Question10 tree = new Question10();

        //Level 0
        tree.root = new Node(1);

        //Level 1
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);

        //Level 2
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.BFS(tree.root));
    }
}
