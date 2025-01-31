// Write a program to check if one string is a rotation of another string. A string
// S2 is a rotation of S1 if it can be obtained by moving some leading characters of
// S1 to its end, while keeping the order of characters intact.

// Input: S1 = ""coding""
// S2 = ""ingcod""

// Output: true

import java.util.Arrays;
import java.util.Scanner;
public class que_7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();
        char[] temp_1 = s1.toCharArray();
        char[] temp_2 = s2.toCharArray();
        Arrays.sort(temp_1);
        Arrays.sort(temp_2);

        if(Arrays.equals(temp_1,temp_2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        sc.close();
    }
}
