public static int[] findAllMissingNumber() {
    int[] ms = new int[] {};
    int min;
    int max;
    int[] list = new int[] {1,2,3,4,5,6};
    for (int i = 0; i < list.length; i++) {
        min = Math.min(list[i],min); 
        max = Math.max(list[i],max); 
    }
    int prev = max;
    for (int j = list.length; j > 0; j--) {
        for (int j2 = prev; j2 < list[j]; j2++) {
            ms[ms.length < 1 ? 0 : ms.length-1 ] = prev+j2;
        }
    }
    return ms;
}