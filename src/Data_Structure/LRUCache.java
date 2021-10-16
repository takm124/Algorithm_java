package Data_Structure;

import java.util.Map;

// 노드 클래스
class Node {
    private int id; // 키
    private String data; // 데이터
    private Node prevNode; // 이전 노드
    private Node nextNode; // 다음 노드

    public Node(){

    }

    public Node(int id, String data) {
        this.id = id;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public Node getPrevNode() {
        return prevNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}

// 이중 연결리스트 클래스
class DoublyLinkedList {
    private Node headNode; // 시작 노드
    private Node tailNode; // 끝 노드

    public Node getHeadNode() {
        return headNode;
    }

    public Node getTailNode() {
        return tailNode;
    }

    public void setHeadNode(Node headNode) {
        this.headNode = headNode;
    }

    public void setTailNode(Node tailNode) {
        this.tailNode = tailNode;
    }
}

// LRU 캐시 클래스
public class LRUCache {
    // 캐시 크기
    private static final int CAPACITY = 5;

    // 현재 크기
    private int actualSize;

    private Map<Integer, Node> map;
    private DoublyLinkedList linkedList;

    // 생성자
    public LRUCache(Map<Integer, Node> map, DoublyLinkedList linkedList) {
        this.map = map;
        this.linkedList = linkedList;
    }

    // 삽입 메소드
    public void put(int id, String data) {

        // 기존 노드가 있다면 업데이트
        if (map.containsKey(id)) {
            Node node = this.map.get(id);
            node.setData(data);
            update(node);
            return;
        }

        // 새 노드 생성
        Node newNode = new Node(id, data);

        // 현재 사이즈가 캐시 크기보다 작은 경우
        if (this.actualSize < CAPACITY) {
            this.actualSize++;
            add(newNode);  // 삽입
        } else { // 캐시가 가득차서 데이터를 지워야 한다면
            removeTail();
            add(newNode);
        }
    }

    // 노드 삽입 처리
    private void add(Node newNode) {

        // 새로운 Node와 head 연결
        newNode.setNextNode(this.linkedList.getHeadNode());
        newNode.setPrevNode(null);

        // 기존에 head에 있는 노드를 다음 노드로 설정
        if (linkedList.getHeadNode() != null) {
            linkedList.getHeadNode().setPrevNode(newNode);
        }

        ///////////////////// 여기까지가 데이터 삽입전 가장 최근 데이터와 새로운 노드를 연결하는 과정

        // 새 노드를 head 노드로 설정
        linkedList.setHeadNode(newNode);

        // tail 노드가 없으면 tail 노드를 새 노드로 세팅 -> 데이터가 하나인 경우
        if (linkedList.getTailNode() == null) {
            linkedList.setTailNode(newNode);
        }

        // map에 저장
        this.map.put(newNode.getId(), newNode);
    }

    // 업데이트 -> 데이터를 새로 사용함을 의미
    private void update(Node node) {
        // 이전, 다음 노드 추출
        Node prevNode = node.getPrevNode();
        Node nextNode = node.getNextNode();

        // head 노드가 아닌 경우
        if (prevNode != null) {
            // 내 앞 뒤 노드를 연결시켜줌
            prevNode.setNextNode((nextNode));
        } else { //head 노드인 경우
            this.linkedList.setHeadNode(nextNode); // 다음노드를 head 노드로 세팅
        }

        // tail 노드가 아니면 (middle 위치일 경우)
        if (nextNode != null) {
            nextNode.setPrevNode(prevNode);
        } else { // tail 노드인 경우
            this.linkedList.setTailNode(prevNode); // tail 노드를 이전 노드로 변경
        }

        // 노드를 새로 삽입해서 head로 변경
        add(node);
    }

    // tail 노드 삭제
    private void removeTail() {

        // tail 노드 추출
        Node lastNode = this.map.get(this.linkedList.getTailNode().getId());

        // tail 노드의 이전 노드를 tail 노드로 변경
        this.linkedList.setTailNode(linkedList.getTailNode().getPrevNode());

        // 기존의 tail 노드를 null로 변경
        if (this.linkedList.getTailNode() != null) {
            this.linkedList.getTailNode().setNextNode(null);
        }

        lastNode = null; // 추출한 기존의 tail 노드를 null로 초기화
    }

}
