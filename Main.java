/**
 * Main
 */
public class Main {

    public static void main(final String[] args) {

    }
    public static String removeVowel(String str){
        return str.replaceAll("[aeiou]", "");
    }
    public static int findDuplicateNumber(int[] list){
        try{
            int slow_pointer = 0;
            int fast_pointer = 0;
    
            slow_pointer = list[slow_pointer];
            fast_pointer = list[fast_pointer];
            
            while(slow_pointer < fast_pointer){
                slow_pointer = list[slow_pointer];
                fast_pointer = list[fast_pointer];
            }
            int a_pointer = slow_pointer;
            int b_pointer = 0;
    
            a_pointer = list[a_pointer];
            b_pointer = list[b_pointer];
            
            while(a_pointer != b_pointer){
                a_pointer = list[a_pointer];
                b_pointer = list[b_pointer];
            }
            return a_pointer;
        } catch (ArrayIndexOutOfBoundsException e) {
            //TODO: handle exception
        }
        return -1;
    }
    public static String[] revStr(String[] str){
        if(str.length < 1) return str;
        int start_pointer = 0;
        int end_pointer = str.length - 1;
        while(start_pointer < end_pointer){
            String temp = str[start_pointer];
            str[start_pointer] = str[end_pointer];
            str[end_pointer] = temp;
            start_pointer++;
            end_pointer--;
        }
        return str;
    }
    public static int LongestPalindrome(String letter) {
        int[] list = new int[128];
        // WHAT WE ARE DOING HERE IS WITH THE CHAR
        // WE CAN GET IT ASCIS INDEX IN THE 128 ARRY STORED ABOVE
        // SO IF WE PASS SOMETHING LIKE c  WHICH IT'S 68 IT WILL
        // INCREATE THE VALUE AT THAT IDX
        for (char c : letter.toCharArray()) {
            list[c]++;
        }

        int result = 0;
        for(int i : list) {
            result += i / 2 * 2;
            if(result % 2 == 0 && i % 2 == 1)result+=1;

        }
        return result;
    }
}

/**
 * InnerMain
 */
class ListNode {
    int value = 0;
    ListNode next = null;

    public ListNode(int value) {
        this.value = value;
    }
}

class Node {
    public Node left;
    public int value;
    public Node right;
    
    @Override
    public String toString() {
        return "Node [left=" + left + ", right=" + right + ", value=" + value + "]";
    }

    public Node(int value) {
        this.value = value;
    }
    
}

class BinaryTree {
    private Node root;
    public void insert(int value){
        Node new_node = new Node(value);

        if(root == null){
            root = new_node;
        }else{
            Node current = root;
            while (true){
                if(current.value == value)break;
                if(current.value > value){
                    if(current.right == null){
                        current.right = new_node;
                    }else{
                        current = current.right;
                    }
                }
                else{
                    if(current.left == null){
                        current.left = new_node;
                    }else{
                        current = current.left;
                    }
                };
            }
            
        }

    }    
    public String string(){
        return root.toString();
    }
}