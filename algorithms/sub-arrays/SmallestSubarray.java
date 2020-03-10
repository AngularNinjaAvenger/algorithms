// now what were doing here is we are using the sliding window 
    // check what is the minimum number of calulcation to get
    // a sum that is greater than the target eg
    //  [1,2,3,4,5,1,2] target 4 so we can do (2+1+1) but we can also
    // do 2+2 <-- so the minimum we have to calculate now is 2

    public static int SmallestSubArray(int[] list, int target) {
        int min = 0;
        int startPtr = 0;
        int sum = 0;
        for (int endPtr = 0; endPtr < list.length; endPtr++) {
            sum+=list[endPtr];
            while(sum >= target){ // <-- the purpose of this array is to srink the sub part 
                                 //      donw since we are tring to get the min sub array
                min = Math.min(min,( endPtr - startPtr ) + 1 ); // this is how to get the min
                sum-= list[startPtr]; // <--- adjusting the pointer
                startPtr++; // <-- this is how you srink the sum
            }
        }
        return min;
    }