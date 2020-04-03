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

public static int[] reverseLinkedList() {
    //  5 -> 4 -> 2 -> 1 
    // 4 -> 5 ->
    //
    // 
    
    /**
     * new_list = list.head 
     * iterate over list.next
     *      temp = current
     *      temp.next = null
     *      temp.next = new_list
     *      new_list = temp
     */
    return null;        
} 


// head 1 -> 2 -> 4 -> 5 ->
// temp_head  2 -> 4 -> 5 ->
/**
 * prev = 2 -> null
    iterate over head
        next_node = head.next 4 -> 5 ->
        head.next = prev 4 -> null
        prev = head 4 -> null
        head = next_node 4 -> 5 ->
 */