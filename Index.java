import java.util.*;


class Index {
		public static void main (String[] arg){
			System.out.print(twoSum([5,5],10));
		}
		
		public static boolean twoSum(int[] nums, int target) {
			
			for(int i = 0;i<nums.length();i++){
				for(int j = 0;j<nums.length();j++){
					if ( (nums[i] + nums[j]) == target ){
						return true;
					}
				}
			}
		}

		public static Integer charDuplicate(String value){
			Map<String,Integer> dic = new HashMap();
			String maxKey;
			int maxVal = 0;
			for(int i = 0;i<value.length();i++){
				String key =""+value.charAt(i);
				if(!dic.containsKey(key))dic.put(key,0);
				int currrentValue = dic.get(key);
				dic.put(key,currrentValue+1);
			}
			for(String key:dic.keySet()){
				int x =dic.get(key); 
				if(x > maxVal){
					maxKey = key; 
					maxVal = x; 
				}
			}
			return maxVal;
		}
		public static String print(String value){
			System.out.print(value);
			return value;
		}
		public static Integer print(Integer value){
			System.out.print(value);
			return  value;
		}
		public static boolean print(boolean value){
			System.out.print(value);
			return  value;
		}
}

