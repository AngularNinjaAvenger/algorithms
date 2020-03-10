class BinaryTree {
    private Node root;
    public void insert(int value){
        Node new_node = new Node(value);

        if(root == null){
            root = new_node;
        }else{
            Node current = root;
            while (true){
                if(current.value == value)break;
                if(current.value > value){
                    if(current.right == null){
                        current.right = new_node;
                    }else{
                        current = current.right;
                    }
                }
                else{
                    if(current.left == null){
                        current.left = new_node;
                    }else{
                        current = current.left;
                    }
                };
            }
            
        }

    }    
    public String string(){
        return root.toString();
    }
}