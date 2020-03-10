public static int findDuplicateNumber(int[] list){
    try{
        int slow_pointer = 0;
        int fast_pointer = 0;

        slow_pointer = list[slow_pointer];
        fast_pointer = list[fast_pointer];
        
        while(slow_pointer < fast_pointer){
            slow_pointer = list[slow_pointer];
            fast_pointer = list[fast_pointer];
        }
        int a_pointer = slow_pointer;
        int b_pointer = 0;

        a_pointer = list[a_pointer];
        b_pointer = list[b_pointer];
        
        while(a_pointer != b_pointer){
            a_pointer = list[a_pointer];
            b_pointer = list[b_pointer];
        }
        return a_pointer;
    } catch (ArrayIndexOutOfBoundsException e) {
        //TODO: handle exception
    }
    return -1;
}