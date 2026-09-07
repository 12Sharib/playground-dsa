package arrays.medium;

public class Q13_TrappingRainWater_Optimal {

    private void maxArea(int[] height) {

       int leftMax = height[0];
       int rightMax = height[height.length - 1];
       int left = 0;
       int water = 0;

       int right = height.length - 1;

        while (left < right) {
            // leftMax = Math.max(height[left], leftMax);

            if (leftMax <= rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];

            }else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];

            }
        }
        System.out.println(water);


    }

    public static void main(String[] args) {
        Q13_TrappingRainWater_Optimal solution = new Q13_TrappingRainWater_Optimal();
        solution.maxArea(new int[]{9,2,0,3,2,7});
    }
}
