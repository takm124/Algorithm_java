package inflearn.section7_Recursive_Tree_Graph;

class Node {
    int data; //노드가 가지고 있는 데이터
    Node lt, rt; //노드 객체의 주소 저장
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Question5 {
    Node root;
    public void DFS(Node root) {
        if (root == null) {
            return;
        } else {
            //System.out.print(root.data + " "); //전위순회(부모 - 왼쪽 자식 - 오른쪽 자식) 1 2 4 5 3 6 7
            DFS(root.lt);
            //System.out.print(root.data + " "); //중위순회(왼쪽 자식 - 부모 - 오른쪽 자식) 4 2 5 1 6 3 7
            DFS(root.rt);
            System.out.print(root.data + " "); //후위순회(왼쪽 자식 - 오른쪽 자식 - 부모) 4 5 2 6 7 3 1
        }
    }

    public static void main(String[] args) {
        Question5 tree = new Question5();
        //Level 1
        tree.root = new Node(1);

        //Level 2
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);

        //Level 3
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.DFS(tree.root);
    }
}
