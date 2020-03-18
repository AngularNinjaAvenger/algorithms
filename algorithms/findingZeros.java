public static int[] moveZero(int[] list){
    int sp = 0;
    int ep = list.length-1;

    while( sp < ep ){

        if (list[sp] == 0){
            if(list[ep] > 0){
                int swap = list[ep];
                list[ep] = list[sp];
                list[sp] = swap;
                sp++;
            }
            ep--;
        }else sp++;
    }

    for (int i : list) {
        System.out.println(i);
    }
    return list;
}