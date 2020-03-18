public static int findMaxProfit(int[] prices){
    // this is the best time to buy stock problem it wil show you your maxium profit you can make
    int max = 0;
    int min = Integer.MIN_VALUE;
    for (int price = 0; price < prices.length; price++) {
        if(prices[price] < min)min = prices[price];
        else{
            max = Math.max(max ,prices[price] - min);
        }
    }
}
return max;