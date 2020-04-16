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