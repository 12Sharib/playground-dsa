package stack.medium;

import java.util.Arrays;
import java.util.Stack;

public class Q25_DailyTemperatures {

    /*
    Q25 - Daily Temperatures

    Difficulty:
    Medium

    Pattern / Algorithm:
    // You identify this

    Problem:

    Given an array of integers temperatures representing
    the daily temperatures, return an array answer where:

    answer[i] is the number of days you have to wait after
    day i to get a warmer temperature.

    If there is no future day for which this is possible,
    put 0 instead.

    --------------------------------------------------

    Example 1:

    Input:
    temperatures = [73,74,75,71,69,72,76,73]

    Output:
    [1,1,4,2,1,1,0,0]

    Explanation:

    - Day 0: 73 -> 74, wait 1 day
    - Day 1: 74 -> 75, wait 1 day
    - Day 2: 75 -> 76, wait 4 days
    - Day 3: 71 -> 72, wait 2 days
    - Day 4: 69 -> 72, wait 1 day
    - Day 5: 72 -> 76, wait 1 day
    - Day 6: 76 -> no warmer future day, so 0
    - Day 7: 73 -> no warmer future day, so 0

    --------------------------------------------------

    Example 2:

    Input:
    temperatures = [30,40,50,60]

    Output:
    [1,1,1,0]

    --------------------------------------------------

    Example 3:

    Input:
    temperatures = [30,60,90]

    Output:
    [1,1,0]

    --------------------------------------------------

    Example 4:

    Input:
    temperatures = [73,72,71,70]

    Output:
    [0,0,0,0]

    --------------------------------------------------

    Constraints:

    1 <= temperatures.length <= 10^5

    30 <= temperatures[i] <= 100

    --------------------------------------------------

    Method:
    */

    public int[] dailyTemperatures(int[] temperatures) {
        // Your code here
        Stack<Integer> stack = new Stack<>();
        int [] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
//             [1,1,4,2,1,1,0,0]
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {

                res[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(res));
        return null;
    }

    public static void main(String[] args) {
        Q25_DailyTemperatures q = new Q25_DailyTemperatures();
        System.out.println(q.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }
}