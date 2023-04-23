package leetcode_easy;

public class Water_Bottles_1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int answer = numBottles;

        while (numBottles >= numExchange) {
            int rem = numBottles % numExchange;
            numBottles /= numExchange;
            answer += numBottles;
            numBottles += rem;
        }

        return answer;
    }
}
