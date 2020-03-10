// TWO SUM
		/*
			how it is working it will add all the numbers to map
			then what it will do is it will check target - list[i] = storedkeyalredy;
			itwill chcek if it is  
		*/
		public static int[] twoSum(int[] list,int target){
			Map<Integer,Integer> match = new HashMap<Integer,Integer>();
			for (int i = 0; i < list.length; i++) {
				int complement = target - list[i];
				if(match.containsKey(complement)){
					return new int[] {complement,list[i]};
				}
				match.put(list[i], i);
			}
			throw new IllegalArgumentException("no match found"); 
		}	