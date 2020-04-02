public static int[] findShortestSubArrayToSortAList(int[] list) {
    // this clones the list by defrencing the poitner
    // and giving it a new pointer location
    int[] sortedList = list.clone();
    Arrays.sort(sortedList);
    int sPtr = sortedList.length,ePtr = 0;
    for (int i = 0; i < sortedList.length; i++) {
        if(sortedList[i] != list[i]){
            sPtr = Math.min(sPtr,i);
            ePtr = Math.max(ePtr,i);
        }
    }
    
    return null;
}