package practice.slidingWindow;

public class BestTimeToBuySell2 {
  public int maxProfit(int[] prices) {
    int i = 0;
    // int j = 1;
    int profit = 0;
    int n = prices.length;
    // int sellPrice = 0;
    int buy;
    int sell;

    while (i < n) {
      while (i < n && prices[i + 1] < prices[i]) {
        i++;
      }
      buy = prices[i];
      while (i < n && prices[i + 1] > prices[i])
        i++;
      sell = prices[i];

      profit = profit + (sell - buy);

    }
    return profit;

  }

  public int maxProfit2(int[] prices) {
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i - 1])
        profit += (prices[i] - prices[i - 1]);
    }

    return profit;
  }

  public static void main(String[] args) {
    BestTimeToBuySell2 s = new BestTimeToBuySell2();
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    System.out.println(s.maxProfit(prices));
  }
}
