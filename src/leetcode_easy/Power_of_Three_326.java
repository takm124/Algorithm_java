package leetcode_easy;

public class Power_of_Three_326 {
    public boolean isPowerOfThree(int n) {
        if (n < 1) return false;

        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }
            n = n / 3;
        }

        return true;
    }
}
