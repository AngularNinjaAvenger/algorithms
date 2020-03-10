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