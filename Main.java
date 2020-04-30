import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        int[] list = new int[] {1,2,3,4,3};
        int target  = 7;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        combinationSum(list,0,target,result);

        System.out.println(result);
    }
    /**
     *  list = [1,2,3,4,3]
     * target = 7
     * 
     * output = [
     *      [3,3,1],
     *      [4,3],
     *      [4,2,1],
     * ]
     * 
     * NOTE:there must be no duplucate
     */
    public static int[][] combinationSum(int[] list ,int current,int target,List<List<Integer>> reult){

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