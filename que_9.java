// Write a Java program to find the row with the maximum sum in a 2D array.

// Input the number of rows and columns in the array.
// Take user input to populate the 2D array.
// Use a for-each loop to iterate over the array and calculate the sum of each row.
// Print the row number (1-based indexing) and the corresponding sum of the row with the maximum sum.

// Input:
// 3 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12

// Output:
// Row with the maximum sum: 3
// Maximum sum: 42

import java.util.Scanner;
public class que_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colms = sc.nextInt();
        int[][] matrix = new int[rows][colms];
        int max=0,maxrow=0;
        for( int i= 0;i<rows;i++){
            int sum=0;
            for(int j=0;j<colms;j++){
                matrix[i][j]= sc.nextInt();
                sum+=matrix[i][j];
            }
            if(sum>max){
                max=sum;
                maxrow=i;
            }
        }
        System.out.println("Row with maximum sum: "+(maxrow+1));
        System.out.println("Maximum sum: "+max);
        sc.close();
    }
}
