package leetcode_easy;

public class Arranging_Coins_441 {
    public int arrangeCoins(int n) {
        int count = 0;
        while (n > 0) {
            n -= ++count;
        }
        return n < 0 ? count - 1 : count;
    }
}
