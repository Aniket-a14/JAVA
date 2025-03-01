// Problem Description:
// Write a method to check if a given string is a palindrome (reads the same forwards and backwards).

// Input: str = ""madam""
// Output: true

// Input: str = ""hello""
// Output: false

// Explanation:
// For the input string ""madam"", it reads the same forwards and backwards, so the output is true. For ""hello"", it does not, so the output is false.


import java.util.*;

public class que_13 {
    public static boolean checkPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void show(boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        boolean isPalindrome = checkPalindrome(str);
        show(isPalindrome);
        sc.close();
    }
}
