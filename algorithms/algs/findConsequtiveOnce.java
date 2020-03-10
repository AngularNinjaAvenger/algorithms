public static int findConsequtiveOnce(int[] list){
   
    int max = 0;
    int cur_cout = 0;

    for (int i = 0; i < list.length; i++) {
        if(list[i] == 1){
            cur_cout++;
            max = Math.max(cur_cout,max);
        }
        else{
            cur_cout = 0;
        }
    }
    return max;

}