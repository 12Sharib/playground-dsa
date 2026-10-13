package hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q26_NextGreaterElementI {

    /*
    Q26 - Next Greater Element I

    Difficulty:
    Easy / Medium

    Pattern / Algorithm:
    // You identify this

    Problem:

    Given two distinct integer arrays nums1 and nums2, where
    nums1 is a subset of nums2.

    For each element in nums1, find the next greater element
    of that element in nums2.

    The next greater element of an element x is the first
    element to the right of x in nums2 that is greater than x.

    If there is no greater element, return -1.

    --------------------------------------------------

    Example 1:

    Input:
    nums1 = [4,1,2]
    nums2 = [1,3,4,2]

    Output:
    [-1,3,-1]

    Explanation:

    For 4:
    There is no greater element to its right.
    Answer = -1

    For 1:
    The next greater element is 3.
    Answer = 3

    For 2:
    There is no greater element to its right.
    Answer = -1

    --------------------------------------------------

    Example 2:

    Input:
    nums1 = [2,4]
    nums2 = [1,2,3,4]

    Output:
    [3,-1]

    Explanation:

    For 2:
    The next greater element is 3.

    For 4:
    There is no greater element to its right.

    --------------------------------------------------

    Example 3:

    Input:
    nums1 = [1,3]
    nums2 = [2,1,3,4]

    Output:
    [3,4]

    --------------------------------------------------

    Constraints:

    1 <= nums1.length <= nums2.length <= 1000

    0 <= nums1[i], nums2[i] <= 10^4

    All integers in nums1 and nums2 are unique.

    nums1 is a subset of nums2.

    --------------------------------------------------

    Method:
    */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans = new int[nums1.length];


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            int max = -1;
            if (map.containsKey(nums1[i])) {
                int index = map.get(nums1[i]);
                while(index < nums2.length - 1)  {
                    if(nums2[index+1] > nums1[i]) {
                        max = nums2[index+1];
                        break;
                    }
                    index++;
                }
            }
            ans[i] = max;

        }
        return ans;
    }

    public static void main(String[] args) {
        Q26_NextGreaterElementI q = new Q26_NextGreaterElementI();
        System.out.println(q.nextGreaterElement(new int[]{2}, new int[]{2,0,3}));
    }
}