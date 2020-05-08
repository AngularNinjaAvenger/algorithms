import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class LargestValuesFromLablel {
    public static void main(String[] args) {
        int[] values = new int[] {5,4,3,2,1};
        int[] labels = new int[] {1,1,2,2,3};
        int numWanted = 3;
        int useLimit = 2;
        int output = largestValuesFromLabel(values,labels,numWanted,useLimit);
        System.out.println(output);
    }

    public static int largestValuesFromLabel(int[] values,int[] labels,int numWanted,int useLimit){
        List<Item> items = new ArrayList<Item>();
        for (int i = 0; i < values.length; i++) {
            items.add(new Item(values[i], labels[i]));
        }
        PriorityQueue<Item> max = new PriorityQueue<Item>((Item a,Item b) -> a.value - b.value);
        max.addAll(items);

        Map<Integer,Integer> labelsCount = new HashMap<Integer,Integer>();
        int maxValue = 0;
        
        while (max.isEmpty() && numWanted >= 0) {
            Item current = max.remove();

            int label = current.label;
            if(labelsCount.containsValue(label))labelsCount.put(label,0);
            labelsCount.put(label,labelsCount.get(label)+1);

            if(labelsCount.get(label) <= useLimit){
                maxValue+=current.value;
                numWanted--;
            }
        }

        return maxValue;
    }
    static class Item {
        int label;
        int value;
        public Item(int value,int label) {
            this.label = label;
            this.value = value;
        }   
    }
}