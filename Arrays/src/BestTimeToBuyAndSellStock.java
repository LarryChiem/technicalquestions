public class BestTimeToBuyAndSellStock {
//    121.https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int price:prices){
            maxProfit = Math.max(maxProfit, price - minPrice);
            minPrice = Math.min(minPrice, price);
        }
        return maxProfit;
    }
}
//Specifically, you may notice that the maximum profit
//that can be made by selling on a specific day is determined by the minimum of the
//stock prices over the previous days. Since the maximum profit corresponds to selling
//on some day, the following algorithm correctly computes the maximum profit. Iterate
//through S, keeping track of the minimum element m seen thus far. If the difference
//of the current element and m is greater than the maximum profit recorded so far,
//update the maximum profit. This algorithm performs a constant amount of work per
//array element, leading to an 0(n) time complexity. It uses two float-valued variables
//(the minimum element and the maximum profit recorded so far) and an iterator, i.e.,
//0(1) additional space.