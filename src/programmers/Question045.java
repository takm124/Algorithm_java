package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Question045 { // 다리를 지나는 트럭
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < truck_weights.length; i++) {
            q.offer(truck_weights[i]);
        }

        Queue<Integer> tmpQ = new LinkedList<>(); // 다리 위
        int sum = 0; // 다리 위 트럭의 총 무게
        while (!q.isEmpty()) {
            time++;

            if (tmpQ.size() == bridge_length) {
                sum -= tmpQ.poll();;
            }

            if (sum +  q.peek() <= weight) { //현재 다리 위 트럭 무게의 합과 다음 트럭의 합이 하중을 견딜 수 있을 때
                int truck = q.poll();
                tmpQ.offer(truck);
                sum += truck;
            } else {
                tmpQ.offer(0);
            }
        }
        // 마지막 트럭이 다리위에 올라갔을 때 while문을 빠져나오기 때문에, 다리 길이만큼 더하여 최종 결과값을 도출한다.

        return time + bridge_length;
    }
}
