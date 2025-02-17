// Problem: Given an integer N, print all prime numbers up to N using the Sieve of Eratosthenes algorithm.

// Example:
// Input: N = 20
// Output: 2, 3, 5, 7, 11, 13, 17, 19

import java.util.Scanner;
public class que_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printPrimes(n);
        sc.close();
    }

    public static void printPrimes(int n){
        boolean[] isPrime = new boolean[n+1];
        for(int i=0;i<=n;i++){
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;

        for(int p=2;p*p<=n;p++){
            if(isPrime[p]){
                for(int i=p*p;i<=n;i+=p){
                    isPrime[i] = false;
                }
            }   
        }

        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }   
        }
    }
}