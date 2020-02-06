import java.util.*;
/**
 * Main
 */
public class Main {

    public static void main(final String[] args) {
        System.out.println(removeVowel("bishop"));
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
    private static int containsTheMostWater(int[] list) {
        int max_area = 0;
        int start_pointer = 0;
        int end_pointer = list.length - 1;
        while (start_pointer < end_pointer){
            if(list[start_pointer] > list[end_pointer]){
                max_area = Math.max(max_area, list[start_pointer]);
                start_pointer++;
            }
            else {
                max_area = Math.max(max_area, list[end_pointer]);
                end_pointer--;
            }
        }
        return max_area;
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