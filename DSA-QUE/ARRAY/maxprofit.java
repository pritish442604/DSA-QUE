public class maxprofit {
    public static void main(String[] args) {
        
        int[] prices = {7, 1, 5, 3, 6, 4};
        
        int profit = maxProfit(prices);
        
        System.out.println(profit);
    }

    public static int maxProfit(int[] prices) {
        
        if (prices == null || prices.length == 0)
            return 0;
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            
            if (price < minPrice) {
                minPrice = price;   // Update minimum price hai orS isme add kar sakte hai
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;   // Update maximum profit hai 
            }
        }
        
        return maxProfit;
    }
}   