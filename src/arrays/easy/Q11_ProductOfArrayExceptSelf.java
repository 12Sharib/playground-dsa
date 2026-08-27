package arrays.easy;

import java.util.Arrays;

public class Q11_ProductOfArrayExceptSelf {

    /*
    Q11 - Product of Array Except Self

    Difficulty:
    Medium

    Problem:

    Given an integer array nums, return an array answer such that
    answer[i] is equal to the product of all the elements of nums
    except nums[i].

    You must solve it without using the division operator.

    --------------------------------------------------

    Example 1:

    Input:
    nums = [1,2,3,4]

    Output:
    [24,12,8,6]

    --------------------------------------------------

    Example 2:

    Input:
    nums = [-1,1,0,-3,3]

    Output:
    [0,0,9,0,0]

    --------------------------------------------------

    Constraints:

    2 <= nums.length <= 100000

    -30 <= nums[i] <= 30

    The product of any prefix or suffix of nums is guaranteed
    to fit in a 32-bit integer.

    --------------------------------------------------

    Follow-up:

    Can you solve it in O(n) time?

    Can you do it with O(1) extra space?
    (The output array does not count as extra space.)

    --------------------------------------------------

    Approach:
    // You fill

    Time Complexity:
    // You fill

    Space Complexity:
    // You fill

    Edge Cases:
    // You fill
    */

    public int[] productExceptSelf(int[] nums) {
        int [] prefix = new int[nums.length];
        int [] suffix = new int[nums.length];

        prefix[0] = nums[0];
        suffix[nums.length - 1] = nums[nums.length - 1];

        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i];
        }
        for(int i = nums.length - 2; i >= 0; i--){
            suffix[i] = suffix[i+1] * nums[i];
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));

//        [24,12,8,6]


        int i=0;int j=0;

        while (i< prefix.length && j < suffix.length){
            if (i == 0){
                nums[i] = suffix[j+1];
            }else if(j == suffix.length-1){
                nums[i] = prefix[i-1];
            }else {
                nums[i] = prefix[i-1] * suffix[j+1];
            }
           i++;j++;
        }

        System.out.println(Arrays.toString(nums));

        return new int[]{};
    }

    public static void main(String[] args) {
        Q11_ProductOfArrayExceptSelf q = new Q11_ProductOfArrayExceptSelf();
        System.out.println(Arrays.toString(q.productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}