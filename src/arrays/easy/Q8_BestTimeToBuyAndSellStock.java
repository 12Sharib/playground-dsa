package arrays.easy;

public class Q8_BestTimeToBuyAndSellStock {

    /*
    Q8 - Best Time to Buy and Sell Stock

    Difficulty:
    Easy

    Problem:

    You are given an array prices where prices[i] is the price of a given
    stock on the ith day.

    You want to maximize your profit by choosing a single day to buy one stock
    and choosing a different day in the future to sell that stock.

    Return the maximum profit you can achieve from this transaction.

    If you cannot achieve any profit, return 0.

    --------------------------------------------------

    Example 1:

    Input:
    prices = [7,1,5,3,6,4]

    Output:
    5

    Explanation:
    Buy on day 2 (price = 1)
    Sell on day 5 (price = 6)

    Profit = 6 - 1 = 5

    --------------------------------------------------

    Example 2:

    Input:
    prices = [7,6,4,3,1]

    Output:
    0

    Explanation:
    No profitable transaction is possible.

    --------------------------------------------------

    Constraints:

    1 <= prices.length <= 100000

    0 <= prices[i] <= 10000

    --------------------------------------------------

    Follow-up:

    Can you solve it in O(n) time?

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

    public int maxProfit(int[] prices) {
        // Your code here     prices = [7,6,4,3,1]     prices = [7,1,5,3,6,4]



        int min = prices[0];
        int maxProfit = 0;
        int i=0;

        while (i < prices.length) {
           if (prices[i] < min) {
               min = prices[i];
           }else{
               maxProfit = Math.max(maxProfit, prices[i] - min);
           }
           i++;
        }
        System.out.println(maxProfit);
        return 0;
    }

    public static void main(String[] args) {
        Q8_BestTimeToBuyAndSellStock s = new Q8_BestTimeToBuyAndSellStock();
        System.out.println(s.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}