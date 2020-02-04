import java.util.*;
/**
 * Main
 */
public class Main {

    public static void main(final String[] args) {
        int area = containsTheMostWater(new int[] {1,2,3,4,5,6,6});
        System.out.println(area);
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