package neetcode.slidingWindow;

public class BestTimeToBuySell {
  public int maxProfit(int[] prices) {
    int i = 0, j = 1; // i = buy, j =sell day
    int maxPrice = 0;

    while (j < prices.length) {
      if (prices[i] < prices[j]) {
        int profit = prices[j] - prices[i];
        maxPrice = Math.max(maxPrice, profit);
        j++;
      } else {
        i = j;
        j++;
      }
    }
    return maxPrice;

  }

}
