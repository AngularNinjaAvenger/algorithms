import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(final String[] args) {

    }
    /**
     * now what this partitions label is doing is giving
     * abcddacbd whatis the maxium patiions we can do
     * and note each letter must be on it own pattion and 
     * not occor in another one 
     */
    public List<Integer> partitionLabel(String s){
        // this store the list of patitions
        List<Integer> partitionLength = new ArrayList<>();
        // since it's only alphabet we are tracking, we are going
        // to use this list to store the last index of the letter 
        // for the string
        int[] lastIndex = new int[26];

        // now this first for loop is going to help us store the last 
        // time the letter index occoured
        for(int i = 0; i < s.length(); i++) {
            // recording the last index of the alphabet , in the list
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        /**
         * with this loop we are now going to be using it to create
         * the partition  
         */
        int i = 0;
        while(i < s.length()){
            /**
             * now for the current index the loop is at
             * it the end int will get the index of it
             * last occrane in the list eg [a,b,a,d,c]
             * for a in this example the end will be ndex  2
             */
            int end = lastIndex[s.charAt(i) - 'a'];
            int j = i+1;
            /**
             * so now we are going to use this j int to check
             * the next letter in the list what is last index
             * and if we see that it is greater than it , we'll 
             * set our end now to be that and we break the loop
             * if we have hit the last occrance of the current i
             * when we increment j 
             */
            while(j != end){
                /**
                 * so here now if the max of j++ is let say past
                 * i now we set the end of our while loop  to be
                 * that end 
                 */
                end = Math.max(end,lastIndex[s.charAt(j++) - 'a']);
            }
            /**
             * the partition we just generated the next thing we do now is to add it 
             * to our list of partition
             */
            partitionLength.add(j-i+1);
            /**
             * 
             */
            i=j+1;
        }
        return partitionLength;
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

