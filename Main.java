import java.lang.reflect.Array;
import java.util.*;






public class Main {
    public static void main(final String[] args) {

    }
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
            digits.soadd(digit - '0');
        }
        while(true){
            // this is going to make sure if the time cross 11:59 it should wrpa the 00:00
            minutes = (minutes + 1) % (24*60);
        }
        return null;
    }
   
}

// NOTE ALWAYS CALCULATE THE RUNTIME COMPLEXITY OF THE ALGORTIHM 
// AFTER COMPLETION

// public static int[][] list(int[][] list,int[] new_time) {
//         int[] previous_time = list[0];
//         for (int i = 0; i < list.length; i++) {
//             if(!(previous_time[1] < new_time[0])){
//                 int max_time = previous_time[1] - previous_time[0];
//                 if(!(list.length >= i+1)){
//                     list[list.length+1] = new_time;
//                 }else{
//                     int free_from_last = list[i+1][0] - previous_time[1];
//                     if(max_time >= free_from_last){
//                         // insert into thee free time
//                         throw new RuntimeException("there is a free time");
//                     }
//                     else{
//                         throw new RuntimeException("there is no free time avaible");
//                     }
//                 };
                
//             }else{
//                 if(!(list.length >= i+1))break;
//                 previous_time = list[i+1];
//             }
//         }
//         // add to the list here it mean there is a free time
//         return list;
//     }



/**
 * 
 */