// Write a program that reverses the digits of a given integer. The program should handle negative integers correctly and return the reversed integer. If the reversed integer overflows the 32-bit signed integer range, return 0.

// Input: N = 123

// Output: 321

// Input 2: N = -456

// Output 2: -654

import java.util.Scanner;
public class que_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int rem, sum = 0;
        if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE){
            System.out.println("0");
        }
        while(num != 0){
            rem = num % 10;
            sum = sum * 10 + rem;
            num /= 10;
        }
        System.out.println("Reverse of the number is: " + sum);
        sc.close();
    }
}
