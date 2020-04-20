import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jdk.nashorn.api.tree.BinaryTree;
//  NOTE MAKE SURE TO LOOK UP JAVA SHCEAT SHEET FOR EACH OF YOUR NOTES
public class Main {

    public static void main(final String[] args) {

    }

    /**
     * your going to be removing node values from a tree and keep the 
     * child node's reference,returning what's is left in the tree, 
     * which will now become a forest
     * 
     * we are going to be taking a dept first approach, because we cannot
     * move from the top to the bottom we'll lose refrence to it child nodes
     * 
     * so by the time we get to the bottom of the tree we now keep a list 
     * where we'll bestoring the remaining nodes that are not in the list
     * 
     *  
     */
    public static TreeNode deleteNodeAndReturnForrest(TreeNode tree,int[] toBeRemoved){
        
    }
/**
 * 
 *              11
        7  10         8 13  
    7  10   8 13  7  10   8 13  
 * 
 * 
 */
   


    public static TreeNode triverse(TreeNode tree,Map<Integer,Boolean> store){
        if(tree == null) return null;
        int left = tree.left.value;
        int right = tree.right.value;
        if(store.get(left))tree.removeLeft();
        if(store.get(right))tree.removeRight();
        tree.left = triverse(tree.left,store);
        tree.right = triverse(tree.right,store);
        return tree;
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