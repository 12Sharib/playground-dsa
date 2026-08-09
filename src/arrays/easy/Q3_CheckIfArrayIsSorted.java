package arrays.easy;

/*
    Given an integer array nums, determine whether the array is sorted in non-decreasing order.

    Return true if sorted, otherwise false.

    Example 1:
    Input: [1,2,2,3,5]
    Output: true

    Example 2:
    Input: [1,3,2]
    Output: false
 */
public class Q3_CheckIfArrayIsSorted {
    private boolean checkIfArrayIsSorted(int[] arr){
        if (arr == null|| arr.length==0){
            return false;
        }
        for(int i=0;i<arr.length-1;i++){
            if (arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Q3_CheckIfArrayIsSorted test = new Q3_CheckIfArrayIsSorted();
        System.out.println(test.checkIfArrayIsSorted(new int[]{1,2,2,3}));

    }
}
