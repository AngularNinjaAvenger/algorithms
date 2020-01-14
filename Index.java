import java.util.LinkedList;
import java.util.Stack;

class Index {
		public static void main(final String[] args) {
			LinkedList<Integer> list1 = new LinkedList<Integer>();
			for (int i = 0; i < 10; i++) {
				list1.add(i);
			}
			cycle(list1.peek());
			// LinkedList<Integer> list2 = new LinkedList<Integer>();
			// for (int i = 10; i < 20; i++) {
			// 	list2.add(i);
			// }
			// mergeLinkedinList(list1,list2);
		}
		// CYCLE LINKEDIN LIST
		/*
			this uses that sliding window stuffs where your chcekcinf
			if there is a cycle in the node
		*/
		public static boolean cycle(ListNode hea){
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
		// MERGELINKEDLIST
		/*
			PATTERN:
				it like that merge in merge sort but this time your making use of a
				linkedin list and it comes inbuilt with java so you dont need to
				make use of x y for tracking
		*/
		public static LinkedList<Integer> mergeLinkedinList (LinkedList<Integer> l1,LinkedList<Integer> l2){
			LinkedList<Integer> joinList = new LinkedList<Integer>();
			while(l1.peekFirst()  != null && l2.peekFirst() != null){
				if(l1.getFirst() < l2.getFirst())joinList.add(l1.pop());
				else joinList.add(l2.get(l1.pop()));
			}
			while (l1.peekFirst() != null){
				joinList.add(l1.pop());
			}
			while (l2.peekFirst() != null){
				joinList.add(l2.pop());
			}
			System.out.println(joinList);
			return joinList;
		} 
		// lONGTEST COMMON PREFIX
		/*
			PATTERN:
				IT o(n)  it stores the first index of the string in
				as the defualt prefix and iterate thru the remaining 
				items in the array and if see that thier prefix dont
				match it other it will keep substringing from the
				prefix string
		*/
		public static String longestCommonPrefix(String[] list) {
			if(list.length < 0) return "";
			String prefix = list[0];
			for (int i = 1; i < list.length; i++) {
				while (list[i].indexOf(prefix) !=0 ) {
					prefix = prefix.substring(0,prefix.length() - 1);
				}
			}
			return prefix;
		}
	}
	// MIN STACK
// PATTERN: 
	/*
	IT USED 2 STACK THE FIRST STACK SORES THE INSERTED VALUE
	THE NEXT STACK TRACKS THE MIN VALUE AND INCASE THERE IS A 
	REMOVAL IT WILL PEAK INTO HE STACK STORING THE MIN VALUES
	IF THAT IS THE ITEM IT WILL ALSO REMOVE IT FROM THE MIN STACK
	*/ 
	class minStack{
		Stack<Integer> stack = new Stack<Integer>();
		// THIS SECOND STAC IS KEEPING TRACK OF THE MIN VALUE
		Stack<Integer> min_val = new Stack<Integer>();

		public void push(int x) {
			if(min_val.isEmpty() || x < min_val.peek()){
				min_val.push(x);
			}
			stack.push(x);
		}
		public void pop(){
			if(stack.pop().equals(min_val.peek())){
				min_val.pop();
			}
			stack.pop();
		}
		public Integer top(){
			return stack.peek();
		}
		public Integer getMin(){
			return min_val.peek();
		}

}