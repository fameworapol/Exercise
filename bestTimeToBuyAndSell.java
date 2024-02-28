package Problem;

public class bestTimeToBuyAndSell {
    //Brute force
    public static int maxProfit1(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if(prices[j] - prices[i]>profit){
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }
    //That's work
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int value = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<value){
                value = prices[i];
            }
            //profit = prices[i] - value;
            if(profit < prices[i] - value){
                profit = prices[i] - value;
            }
        }
        return profit;
    }

    //
    public static int maxProfit3(int[] prices) {
        int currentGap = 0, profit = 0;
        if (prices.length <= 1)
            return 0;

        for (int i=1; i < prices.length; i++) {
            currentGap += prices[i] - prices[i - 1];
            if (currentGap < 0)
                currentGap = 0;
            else if (currentGap > profit)
                profit = currentGap;
        }

        return profit;}

    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit3(prices));
    }
}
