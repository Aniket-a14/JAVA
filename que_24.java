// Problem: Given an array, find the majority element (element appearing more than n/2 times). Use the Boyer-Moore Voting Algorithm.

// Example:
// Input: [3, 3, 4, 2, 3, 3, 3]
// Output: 3

import java.util.Scanner;
public class que_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int majority = findMajorityElement(arr);
        System.out.println("The majority element is: " + majority);
        sc.close();
    }

    public static int findMajorityElement(int[] arr) {
        int count = 0;
        int candidate = -1;

        for(int i=0;i<arr.length;i++){
            if(count == 0){
                candidate = arr[i];
                count = 1;
            }else{
                if(arr[i] == candidate){
                    count++;
                }else{
                    count--;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] == candidate){
                count++;
            }
        }

        if(count > arr.length/2){
            return candidate;
        }
        return -1;
    }
}
