public class task_7{

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        
        int minPrice = prices[0];
        int Profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            else if (prices[i] - minPrice > Profit) {
                Profit = prices[i] - minPrice;
            }
        }
        
        return Profit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices1)); 
        
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices2));
    }
}