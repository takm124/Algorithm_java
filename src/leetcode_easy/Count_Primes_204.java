package leetcode_easy;

public class Count_Primes_204 {
    public int countPrimes(int n) {
        int count = 0;
        int[] arr = new int[n+1];
        if(n == 0 || n == 1) return 0;

        for(int i = 2; i < n; i++) {
            if(arr[i] == 0) {
                count++;
            }
            for(int j = i; j < n; j += i){
                arr[j] = 1;
            }
        }

        return count;
    }
}
