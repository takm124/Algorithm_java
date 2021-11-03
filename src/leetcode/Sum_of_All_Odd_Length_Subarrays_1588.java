package leetcode;

public class Sum_of_All_Odd_Length_Subarrays_1588 {
    public int sumOddLengthSubArrays3(int[] arr) { // brute force
        int total = 0;

        for (int window = 1; window <= arr.length; window += 2)
            for (int i = 0; i + window <= arr.length; i++)
                for (int j = i; j < i + window; j++)
                    total += arr[j];
        return total;
    }

    public int sumOddLengthSubArrays2(int[] arr) { // sliding window
        int total = 0;

        for (int windowSize = 1; windowSize <= arr.length; windowSize += 2) {
            // sum up all the elements in the first window, W1
            int windowSum = 0;
            for (int i = 0; i < windowSize; i++)
                windowSum += arr[i];
            total += windowSum;

            // slide W1 one element at a time.
            // remove (subtract) the first element from the W1 and insert (add) the last element of the slided W1 into the previous sum.
            for (int i = 1; i + windowSize <= arr.length; i++) {
                windowSum = windowSum - arr[i - 1] + arr[i + windowSize - 1];
                total += windowSum;
            }
        }
        return total;
    }

    public int sumOddLengthSubArrays(int[] arr) { // Counting element occurence

        int n = arr.length, sum = 0;

        int evenStops = (n & 1) == 0 ? n /2 : n/ 2 + 1;
        int evenStarts = 1;

        int oddStarts = 0;
        int oddStops = n / 2;

        for (int i = 0; i < n; ++i) {
            sum += ((oddStops * oddStarts) + (evenStops * evenStarts)) * arr[i];
            if ((i & 1) == 0) {
                oddStarts++;
                evenStops--;
            } else {
                evenStarts++;
                oddStops--;
            }
        }
        return sum;
    }


}
