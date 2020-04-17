import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(final String[] args) {
        String res = groupAnagram(new String[] {"cat","pat","mat","sat","fat","map","cap"}).toString();
        System.out.println(res);
    }
    public static String[][] groupAnagram(String[] list){
        Map<String,String[]> store = new HashMap<String,String[]>();
        for (int i = 0; i < list.length; i++) {
            char[] chars = list[i].toCharArray();
            String currentWord = chars.toString();
            char[] SortedWordList = chars.clone(); 
            Arrays.sort(SortedWordList);
            String sortedWord = SortedWordList.toString();
            if(!store.containsKey(sortedWord)){
                store.put(sortedWord,new String[] {currentWord});
            }else{
                String[] tempList = store.get(sortedWord);
                tempList[tempList.length] = currentWord;
            }
        }
        String[][] result = new String[store.size()][];
        int idx = 0;
        for (String item : store.keySet()) {
            result[idx] = store.get(item);
            idx++;
        }
        return result;
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

