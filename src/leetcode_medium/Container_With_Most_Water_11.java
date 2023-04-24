package leetcode_medium;

public class Container_With_Most_Water_11 {
    public int maxArea(int[] height) {
        int lt = 0;
        int rt = height.length - 1;
        int ans = 0;

        while (lt < rt) {
            int size = (rt-lt) * (Math.min(height[lt], height[rt])); // h x w
            ans = Math.max(ans, size);

            /**
             * 관건은 최대 높이를 유지해주는 것
             * 높은 쪽의 위치를 고정해두고, 다른 포인터를 움직여준다.
             */
            if (height[lt] > height[rt]) {
                rt--;
            } else if (height[lt] < height[rt]) {
                lt++;
            } else {
                lt++;
                rt--;
            }
        }

        return ans;
    }
}
