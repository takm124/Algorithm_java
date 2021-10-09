package leetcode;

public class Best_Time_to_Buy_and_Sell_Stock_121 {
    public static int maxProfit(int[] prices) {
        int max =0;
        int arr = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[arr]) {
                max = Math.max(max, prices[i] - prices[arr]);
            } else {
                arr = i;
            }
        }
        return max;
    }
}
