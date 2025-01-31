// You are managing a system that uses a 4-bit permission scheme to represent the access rights of a user. Each bit represents a specific permission:

// Bit 3 (from left): Read
// Bit 2: Write
// Bit 1: Execute
// Bit 0 (from left): Delete
// Write a program that:

// Takes a 4-bit integer (0–15) as the current permissions.
// Takes a bit position (0 to 3) as input and toggles (reverses) the bit at that position using bitwise operators.
// Displays the new permission set after toggling the bit.

// Input:
// Enter current permissions (0-15): 10
// Enter the bit position to toggle (0-3): 2

// Output:
// Original permissions: 1010
// Updated permissions: 1110

import java.util.Scanner;
public class que_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int permissions, position;
        System.out.print("Enter current permissions (0-15): ");
        permissions = sc.nextInt();
        System.out.print("Enter the bit position to toggle (0-3): ");
        position = sc.nextInt();
        System.out.println("Original permissions: " + Integer.toBinaryString(permissions));
        permissions = permissions ^ (1 << position);
        System.out.println("Updated permissions: " + Integer.toBinaryString(permissions));
        sc.close();
    }
}

// XOR: if the bit is 0 it will be 1 and if the bit is 1 it will be 0
// << : left shift operator, it will shift the bit to the left by the number of positions specified like 1 << 2 will shift the bit 2 positions to the left and the result will be 100
// >> : right shift operator, it will shift the bit to the right by the number of positions specified like 100 >> 2 will shift the bit 2 positions to the right and the result will be 1
