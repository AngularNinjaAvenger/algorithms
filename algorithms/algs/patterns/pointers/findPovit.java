// LEFT POINTER
    /*
        now how this algorithm works is your checking to see if any array
        has an idx that all the left sum == right sum to do this
        we first get the total sum, then we loop againg 
        subtracting - lft_ptr - currentarrayidx = lft_ptr 
        there is a povit if not there is no povit.
    */
    public static boolean findPovit(int[] list){
        int total = 0;
        for (int i : list) {
            total+=i;
        }
        int left_pointer = 0;
        for (int i : list) {
            System.out.println(total - left_pointer - i);
            if((total - left_pointer - i) == left_pointer){
                return true;
            }
            left_pointer+=i;
        }
        return false;   
    }