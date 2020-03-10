public static Node reverseLinkedinList(Node list){
    Node prev = new Node(0);
    while( list != null ){
        Node next_node = list.next;
        list.next = prev;
        prev = list;
        list = next_node;
    }
    return prev;
}