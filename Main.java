import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.tree.TreeNode;

import jdk.nashorn.api.tree.BinaryTree;
//  NOTE MAKE SURE TO LOOK UP JAVA SHCEAT SHEET FOR EACH OF YOUR NOTES
public class Main {

    public static void main(final String[] args) {

    }
    /**
     * in this probelm we are goint to be finding the longest consequtive
     * sequence of number ie if the first node is 2 the next consequtive 
     * value should be 3 either from the left or right node of the current node's 
     * child
     */
    public static int binaryTreeLongestConsequtiveSequene(TreeNode tree){
        int[] max = new int[1];
        triverse(tree,max,0,0);
        return max[0];
    }
    public static TreeNode triverse(TreeNode tree,int[] max,int curCount,int target){
        // base case
        if(tree == null)return null;
        // if the current value is == the targe
        else if(tree.val == target)curCount++;
        else curCount = 0;
        max[0] = Math.max(curCount,max[0]);
        // we increase the the target value for the left
        // and the right recursive call
        triverse(tree.left,max,curCount,target+1);
        triverse(tree.right,max,curCount,target+1);
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