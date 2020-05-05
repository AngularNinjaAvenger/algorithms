import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] max = new int[1];
        int[] values = new int[] {5,4,3,2,1};
        int[] labels = new int[] {1,1,2,2,3};
        int numWanted = 3;
        int useLimit = 1;
        Map<Integer,Integer> used = new HashMap<Integer,Integer>();
        System.out.println(max[0]);
        for (int i = 0; i < labels.length; i++) {
            int val = labels[i];
            if(!used.containsKey(val))used.put(val,0);
            int curVal = used.get(val); 
            curVal+=1;
            if(curVal > useLimit)continue;
            used.put(val,curVal);
        }
        largestValuesFromLabel(max,values,labels,numWanted,useLimit,used,0,0,0);
    }

    public static void largestValuesFromLabel(int[] max,int[] values,int[] labels,int numWanted,int useLimit,Map<Integer,Integer> used,int idx,int currentlyUsed,int value){
        if(currentlyUsed == numWanted){
            max[0] = Math.max(max[0],value);
            return;
        }
        for (int i = idx; i < labels.length; i++) {
            if(idx == i){
                currentlyUsed+=1;
                value+=labels[i];
                largestValuesFromLabel(max,values,labels,numWanted,useLimit,used,idx+1,currentlyUsed,value);
                currentlyUsed-=1;
                if (currentlyUsed < 0) currentlyUsed = 0;
            }
        }
    }
}
