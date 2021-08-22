package leetcode;

import java.util.Arrays;

public class Merge_Sorted_Array_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length > 0) {
            for (int i = 0; i < n; i++) {
                nums1[m + i] = nums2[i];
            }
        }
        Arrays.sort(nums1);
    }


    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, finished = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            nums1[finished--] = (nums1[p1] > nums2[p2]) ? nums1[p1--] : nums2[p2--];
        }

        while (p2 >= 0) {
            nums1[finished--] = nums2[p2--];
        }
    }
}
