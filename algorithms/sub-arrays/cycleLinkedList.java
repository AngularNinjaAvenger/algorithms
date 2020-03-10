// CYCLE LINKEDIN LIST
		/*
			this uses that sliding window stuffs where your chcekcinf
			if there is a cycle in the node
		*/
		
		public static boolean cycle(ListNode head){
			if (list.isEmpty()) return false;
			ListNode slow = head;
			ListNode fast = head;
			while (fast.next != null && fast.next.next != null) {
				if(fast == null || fast.next == null) return false;
				slow = slow.next;
				fast = fast.next.next;
			}
			return true;
		}