public static String nextClosestTime(String time){
    // firstly we need a way to reresent the number that we can get next time
    // to do that we are going to do is extract the miutes fom the time
    // params time formart  20:11
    int minutes = ( Integer.parseInt(time.substring(0, 2)) * 60); // first 2 nums
    minutes += Integer.parseInt(time.substring(3)); // second num
    
    // with this digit hash set we can see if our generated time is valid and if it
    // adds up to our time
    HashSet<Integer> digits = new HashSet();
    for (char digit : time.toCharArray()){
        // what we are doing here is we are converting the char to an int
        // NO char to int method in java
        digits.add(digit - '0');
    }
    while(true){
        // this is going to make sure if the time cross 11:59 it should wrpa the 00:00
        minutes = (minutes + 1) % (24*60);
        // covert the time format back to the formart of the normal time
        int[] nextTime = {minutes / 60 / 10,minutes / 60 % 10,minutes % 60 / 10,minutes % 60 % 10};
        
        boolean isValid = true;
        for(int digit:nextTime){
            if(!digits.contains(digit)){
                isValid = false;
            }
        }            

        if(isValid){
            return String.format("/02d:02d",minutes/60,minutes%60);
        }
    }
}