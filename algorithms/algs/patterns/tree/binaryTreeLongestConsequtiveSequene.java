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