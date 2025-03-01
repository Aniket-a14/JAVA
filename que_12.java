// Problem Description:

// Write a program to swap two integer variables without using a temporary variable.

// Input: a = 5, b = 10
// Output: a = 10, b = 5

// Explanation:
// The program swaps the values of a and b using arithmetic or bitwise operations, resulting in a being 10 and b being 5.


import java.util.Scanner;

public class que_12 {
    int a,b;

    que_12(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void swap(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        que_12 obj = new que_12(a,b);
        obj.swap(a,b);
        sc.close();
    }
}
