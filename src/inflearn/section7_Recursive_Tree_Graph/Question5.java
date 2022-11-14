package inflearn.section7_Recursive_Tree_Graph;

import com.sun.tools.javac.Main;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Question5 { // 이진 트리 순회
    static Node root;

    public static void DFS(Node root) {
        if (root == null) return; // 말단인 경우
        else {
            // 전위 순회 : 부모 - 왼쪽 - 오른쪽
            // 중위 순회 : 왼쪽 - 부모 - 오른쪽
            // 후위 순회 : 왼쪽 - 오른쪽 - 부모
            System.out.print(root.data + " ");
            DFS(root.lt);
            DFS(root.rt);
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        DFS(root);
    }
}
