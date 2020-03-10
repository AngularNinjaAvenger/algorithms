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