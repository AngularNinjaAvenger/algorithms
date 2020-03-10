 // MIDDLE LINKEDIN LIST
    /*
        how this works , a fast pointer will be moving twise the speed of
        a slower pointer then by the time the fast ppointer is at the 
        end of the list the slow pointer will be at the middle of the list
        and it will be returned
    */
    public static ListNode middleLinkedList(ListNode head){
        ListNode slow_pointer = head;
        ListNode fast_pointer = head;
        while(slow_pointer.next != null && fast_pointer.next.next != null)
        {
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;
        }   
        return slow_pointer;
    }