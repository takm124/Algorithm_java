package inflearn.section7_Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Question10 { // Tree 말단노드까지의 가장 짧은 경로(BFS)
    Node root;
    int L = 0;
    public int BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node tmp = q.poll();
                if (tmp.lt != null && tmp.rt != null) return L+1;
                if (tmp.lt != null) q.offer(tmp.lt);
                if (tmp.rt != null) q.offer(tmp.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Question10 tree = new Question10();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}
