package leetcode.array.stocker;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] prices = {1, 3, 4, 1, 6};
        solution.maxProfit(prices);

    }
        int profit;

        public int maxProfit(int[] prices) {
            for (int i = 0; i < prices.length-1; i++) {
                if (prices[i] < prices[i+1]){
                    buy(prices[i]);
                    sell(prices[i+1]);
                }
            }
            System.out.println(profit);
            return profit;
        }

        public void buy(int price){
            profit = profit - price;
        }
        public void sell(int price){
            profit = profit + price;
        }

}
