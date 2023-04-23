package leetcode_easy;

public class Can_Place_Flowers_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i++){
            int left = (i - 1) < 0 ? 0 : flowerbed[i-1];
            int right = (i + 1) >= flowerbed.length ? 0 : flowerbed[i+1];
            int current = flowerbed[i];

            if(left == 0 && current == 0 && right == 0){
                flowerbed[i] = 1;
                n--;
            }
        }
        return n > 0 ? false : true;
    }
}
