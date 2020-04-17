import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(final String[] args) {

    }
    public static String[][] groupAnagram(String[] list){
        return null;
    }
    public static int[][] list(int[][] list,int[] new_time) {
        int[] previous_time = list[0];
        for (int i = 0; i < list.length; i++) {
            if(!(previous_time[1] < new_time[0])){
                int max_time = previous_time[1] - previous_time[0];
                if(!(list.length >= i+1)){
                    list[list.length+1] = new_time;
                }else{
                    int free_from_last = list[i+1][0] - previous_time[1];
                    if(max_time >= free_from_last){
                        // insert into thee free time
                        throw new RuntimeException("there is a free time");
                    }
                    else{
                        throw new RuntimeException("there is no free time avaible");
                    }
                };
                
            }else{
                if(!(list.length >= i+1))break;
                previous_time = list[i+1];
            }
        }
        // add to the list here it mean there is a free time
        return list;
    }
}
// NOTE ALWAYS CALCULATE THE RUNTIME COMPLEXITY OF THE ALGORTIHM 
// AFTER COMPLETION

