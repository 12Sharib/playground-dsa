package arrays.easy;

/*
    Given an integer array nums, return the second-largest distinct element.

    If no second-largest element exists, return -1.

    Example 1:
    Input: [1,2,4,7,7,5]
    Output: 5

    Example 2:
    Input: [5,5,5]
    Output: -1
 */
public class Q2_FindSecondLargestElement {
    private int findSecondLargest(int[] nums){
        if(nums == null || nums.length == 0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : nums){
            if (num > max) {
                secondLargest = max;
                max = num;
            }else if (num > secondLargest && num != max){
                secondLargest = num;
            }
        }
        return secondLargest == Integer.MIN_VALUE?-1:secondLargest;
    }
    public static void main(String[] args) {
        Q2_FindSecondLargestElement q = new Q2_FindSecondLargestElement();
        System.out.println(q.findSecondLargest(new int[]{5,4,5}));
    }
}
