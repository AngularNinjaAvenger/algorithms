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