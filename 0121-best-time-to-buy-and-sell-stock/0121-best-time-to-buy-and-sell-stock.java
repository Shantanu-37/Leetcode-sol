class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        // prices - 7,1,5,3,6,4
        //          p
        // minPrice = 7
        // maxPrice = 0

        for(int price : prices){
            if (price < minPrice){
            minPrice = price;
        }

        if (price - minPrice > maxProfit) {
        maxProfit = price - minPrice;
        }
    }
        return maxProfit;
        
    }
}