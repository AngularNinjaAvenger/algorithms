import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

    }
    /**
     * 
     * @param peopleToSave
     * @param limit
     * given a list of ints your going to pair int to determine who can be saved
     * the goal is to get the minum number of list parts to save the int and each 
     * pir must not exceed a limit 
     * 
     * we re going to be using a 2 pointer to solve this
     */
    public int peopleToSave(int[] peopleToSave , int limit){
        int numOfBoats = 0;
        int i = 0;
        int j = peopleToSave.length;
        while(i <= j){
            if(peopleToSave[i] + peopleToSave[j] <= limit){
                j--;
                i++;
            }else{
                j--;
            }
            numOfBoats++;
        }
        return numOfBoats;
    }
}
