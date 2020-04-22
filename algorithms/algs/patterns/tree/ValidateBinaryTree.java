/**
     * we are going to be validating a baniry tree
     * the cases we are going to be testing for is
     * 1. tree's value is greater than the left
     * 2. tree's value is less than  the right
     * 3. and none of the triversed tree left and 
     * right node is null
     */
    public static boolean validateBinaryTree(TreeNode tree){
        boolean[] valid = new boolean[1];
        valid[0] = true;
        triverse(tree,valid);
        return valid[0];
    }
    public static void triverse(TreeNode tree,boolean[] valid){
        if(tree == null || valid[0] == false) return null;
        if (!( ( tree.left != null ) && ( tree.left.val < tree.val ) ))valid[0] = false; 
        if (!( ( tree.right != null ) && ( tree.right.val > tree.val ) ))valid[0] = false; 
        
        triverse(tree.left,valid);
        triverse(tree.right,valid);
    }