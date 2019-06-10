public class ContainerWithMostWater{

    // https://leetcode.com/problems/container-with-most-water/description/

    private static int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

    private int maxArea(int[] height){
        int maxArea = 0;
        int left = 0, right = height.length - 1;
        while(left < right){
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
    }

}
