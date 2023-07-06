package LeetCode.Day2;

public class BestTimeToBuyAndSellStock {

    /*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    Input: prices = [7,1,5,3,6,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     */

    private static int maxProfit(int prices[]) {
        int buy = Integer.MAX_VALUE, sell = 0;
        for(int i=0;i<prices.length;i++) {
            buy = Math.min(buy,prices[i]);
            sell = Math.max(sell,prices[i]-buy);
        }
        return sell;
    }

    public static void main(String args[]) {
        int prices[] = {7,1,3,9,6,2};
        System.out.println("Max Profit: "+maxProfit(prices));
    }
}
