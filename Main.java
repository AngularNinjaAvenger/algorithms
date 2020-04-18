import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
//  NOTE MAKE SURE TO LOOK UP JAVA SHCEAT SHEET FOR EACH OF YOUR NOTES
public class Main {

    public static void main(final String[] args) {
        String res = reArrangeString("bisshop");
        System.out.println(res);
    }
    public static String reArrangeString(String s){
        char[] lst = s.toCharArray();
        char[] dp = new char[s.length()];
        dp[0] = lst[0];
        dp[1] = lst[1];
        StringBuilder match = new StringBuilder();
        for (int i = 2; i < dp.length + 1; i++) {
            dp[i] = lst[i];
            if( dp[i-1] == dp[i-2] && dp[i] != dp[i-1]){
                match.append(dp[i-1]);
                match.append(dp[i]);
                match.append(dp[i-2]);
                return match.toString();
            }
        }
        return "";
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

