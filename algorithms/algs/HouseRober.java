public static int houseRober(int house[]){
    // this is solved using memoizaiton
    // dynamic programming
    
    int dp[] = new int[house.length+1];
    dp[0] = 0;
    dp[1] = house[1]; //<-- because it's not == zero
    for (int i = 1; i < dp.length; i++) {
        // [0,2,3,7,12]
        dp[i] = Math.max(dp[i],dp[i-1] + house[i]);
    }
}