class TreeNode{
    TreeNode left;
    TreeNode right;
    Integer value;
}


public static TreeNode reversBinaryTree(TreeNode tree) {
    if(tree == null)return tree;
    TreeNode left = reversBinaryTree(tree.left);
    TreeNode right = reversBinaryTree(tree.right);

    tree.left = right;
    tree.right = left;
    return tree;
}