// Write a Java program to demonstrate the use of primitive data types and type conversion. The program should:

// Declare and initialize variables of different primitive data types (int, double, char, and boolean).
// Perform type conversion by converting an int to a double and a char to an int.
// Print the values of all variables before and after the conversions.

public class que_2 {
    public static void main(String[] args) {
        int i = 10;
        double d = 10.5;
        char c = 'A';
        boolean b = true;

        System.out.println("Before conversion:");
        System.out.println("int i = " + i);
        System.out.println("double d = " + d);
        System.out.println("char c = " + c);
        System.out.println("boolean b = " + b);

        // Converting int to double
        double num = (double) i;

        // Converting char to int
        int num2 = (int) c;

        System.out.println("\nAfter conversion:");
        System.out.println("int i = " + num);
        System.out.println("char c = " + num2);
    }
}