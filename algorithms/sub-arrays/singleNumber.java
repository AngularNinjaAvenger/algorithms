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