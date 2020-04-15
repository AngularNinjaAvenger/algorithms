/**
     * DYNAMIC PROGRAMMING
        It is used for solving problems without resolving the same problem over and over again .

        They you save value instead of recomputing .

        They see different ways we can solve dynamic problems, this are the component of dynamic programming 

        1. Recrusion
        2. Memoization
        3. Buttom down

        Recrusion 

        Component of dynamic programming 
        Recursion -> we use this to solve the sub problem recrusivly
        Memorisation -> we use this to store computed values 


        Dynamic programming model 

        Top down (Memoization)
        It first stores all the values in list as a cache reference before you then perform your cmption and check the check if the value has already been stored 

        Buttom up (Tabulation)
        This approach avoids recrusion,instead it stores the value in a list of of size n 
        This 2 method both have the same purpose of caching sub probs 

        Fibonacci buttom up Tabulation implementation 
     * */    
    public static int fib(int n){
        int cache[] = new int[n+1];
        cache[0] = 0;
        cache[1] = 1;
        for (int i = 2; i < n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2] 
        }
        return cache[n];
    }