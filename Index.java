import java.util.*;




class Index {
		public static void main(final String[][] args) {
			
		}
		
		
		public static int[] sliceList(int[] ls,int idx){
			int[] list = {};
			int ctr = 0;
			for (int i = idx; i < ls.length; i++) {
				System.out.println(ctr);
				list[ctr] = ls[i];
				ctr++;
			}
			return list;
		}
		public static int[] threeSum(int[] list, int target) {
			for (int i = 0; i < list.length;i++) {
				int[] sliced_list = sliceList(list,i);
				int complement = target - list[i];
				try{
					int[] two = twoSum(sliced_list,complement);
					two[2] = list[i];
					return two;
				}catch (IllegalArgumentException e){}
			}
			throw new IllegalArgumentException("can not be calculated");
		}
		
		
		public static boolean isValid(String parm){
			Stack<Character> temp = new Stack<Character>();
			for (int i = 0; i < parm.length(); i++) {
				char strIdx = parm.charAt(i);
				char l1 = '(';
				char l2 = '{';
				char l3 = '[';
				char r1 = ')';
				char r2 = '}';
				char r3 = ']';
				if(strIdx == l1 || strIdx == l2 || strIdx == l3){ 
					temp.add(strIdx);
				}else{
					if(strIdx == r1 && temp.peek() == l1)temp.pop();
					if(strIdx == r2 && temp.peek() == l2)temp.pop();
					if(strIdx == r3 && temp.peek() == l3)temp.pop();
				}
			}
			if(temp.empty())return true;
			return false;
		}
		// SINGLE NUMBER
		/*
			how you solve this problem is using the bitwise operator
			^ <--- what this does it evaluate if
			1^1 <-- this is false
			1^2 <-- this is true
			so you make use of this shortut to compare the numbers in the
			array
		*/
		public static int singleNumber(int[] nums){
			int res = 0;
			for(int num : nums) {
				res ^= num;
			}
			return res;
		}
		// CYCLE LINKEDIN LIST
		/*
			this uses that sliding window stuffs where your chcekcinf
			if there is a cycle in the node
		*/
		/*
		
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
		*/ 
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

class Node {
	int val;
	Node next = null;

	public Node(int val) {
		this.val = val;
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