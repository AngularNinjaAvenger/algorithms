import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        
    }
    /**
     * input coins [5,5,2] ammount 11
     * solution  = 5 + 5 + 1
     * output 3
     * your finding the smalling summ that 
     * returns that ammount
     * 
     * we are going to be using dp to solve this,
     * by filling it with smallest ammount of coin to
     * fill the particula index then when we get to the end
     * which will be the ammount we just return it 
     */
    public static int ConinChange(int[] opt,int target){
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