public static String[] revStr(String[] str){
    if(str.length < 1) return str;
    int start_pointer = 0;
    int end_pointer = str.length - 1;
    while(start_pointer < end_pointer){
        String temp = str[start_pointer];
        str[start_pointer] = str[end_pointer];
        str[end_pointer] = temp;
        start_pointer++;
        end_pointer--;
    }
    return str;
}
