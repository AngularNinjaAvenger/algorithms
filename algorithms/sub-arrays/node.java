class Node {
    public Node left;
    public int value;
    public Node right;
    
    @Override
    public String toString() {
        return "Node [left=" + left + ", right=" + right + ", value=" + value + "]";
    }

    public Node(int value) {
        this.value = value;
    }
    
}
