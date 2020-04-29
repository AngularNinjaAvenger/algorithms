/**
     * input coins [5,5,2] ammount 11
     * solution  = 5 + 5 + 1
     * output 3
     * your finding the smalling summ that 
     * returns that ammount
     * 
     * we are going to be using dp to solve this,
     * by filling it with smallest ammount of coin to
     * fill the particula index then when we get to the end
     * which will be the ammount we just return it 
     */
    // dp => [0,9,9,9,9,9,9,9,9]
    //        1,2,4, 8
    
    //  1,2,4, 8

    public static int ConinChange(int[] coins,int ammount){
        int[] dp = new int[ ammount + 1 ];
        Arrays.fill(dp,ammount+1);        
        dp[0] = 0;
        for (int i = 0; i < ammount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i], dp[ i - coins[j] ]);
                }   
            }
        }

        return dp[ammount] > ammount ? -1 : dp[ammount];
   
    }package algorithms.algs.patterns.dp;
    
    public class coinChange {
    
    }