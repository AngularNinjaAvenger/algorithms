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