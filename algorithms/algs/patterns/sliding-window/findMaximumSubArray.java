// now what sliding window is is something line when your woring with a list
// and your iterating instead of using bruth force approach of looping over
//  each item in the list what you do is you
// use a set to loop over
// when to use sliding window
// 1. when woring with list
// 2. min max contains problems 

public static int findMaximumSumSubArray(int[] list, int target) {
    int max = 0;
    int curSum = 0;

    for (int i = 0; i < list.length; i++) {
        curSum+=list[i];
        if(i >= (target  - 1)){  // <--- thin if this if condition as the base case for starting the iteration
                                // to make sure that we start at the target index
            max = Math.max(curSum,max); // and here we are comparing to get the max
            curSum-=list[i-(target-1)]; // <-- what were are doing here is the slide we are we are removing the value
                                   // of the first item and so the next iteraion can add the next item
                                  // eg [1 2 3 6 ] 1+2+3 = 4 for us to slide and add 2 + 3 + 6 we need to subtract 1
        }
    }
    return max;
}