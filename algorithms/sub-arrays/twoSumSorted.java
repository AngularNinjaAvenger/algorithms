// TWO SUM TWO
		/*
			THIS IS USED IF THE THE ARRAY IS SORTED ELSE USE THE OTHER METHOD
			WHEN YOU DOING ANY PROBLEM THAT HAS TO DO WITH SORTED ARRAYS USE A POINTER
			note how this works, what it does is , it uses a pointer
			so how this pointer works one will start from the begining 
			of the array the other will start from ary.length 

			
		*/
		public static int[] twoSumSorted(int[] lst,int idx){
			int a_pointer = 0;
			int b_pointer = lst.length - 1;
			while(a_pointer < b_pointer){
				/*
					this will keep loop and adjusting the pointers
					until it finds a match else it return null
				*/
				int sum = lst[a_pointer] + lst[b_pointer];

				if(sum > idx)b_pointer--;
				else if (sum < idx)a_pointer++;
				// this is the base case that returns the array of the found items

				else return new int[] {lst[a_pointer],lst[b_pointer]};
			}
			return new int[] {};
		}