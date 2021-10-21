package leetcode;

public class Valid_Mountain_Array_941 {
    public boolean validMountainArray(int[] arr) {
        boolean direction = true; // true = up hill, false = down hill

        if (arr.length < 3) return false;

        for (int i = 0 ; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] == 0) {
                return false;
            } else if (arr[i] < arr[i + 1]) {
                if (direction == false) {
                    return false;
                }
            } else if (arr[i] > arr[i + 1]) {
                direction = false;
            }
        }

        if (direction == true) return false;

        return true;
    }
}
