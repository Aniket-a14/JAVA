// Write a program that takes a sentence as input and finds the longest word in the sentence. If there are multiple words with the same maximum length, return the first one. Use String class methods and loops to solve the problem.

// Input: Coding is a fun challenge.
// Ouput: challenge

import java.util.Scanner;
public class que_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String line= sc.nextLine();
        String[] words = line.split("");
        String longestWord = "";
        for(int i=0;i<words.length;i++){
            if(words[i].length()> longestWord.length()){
                longestWord = words[i];
            }
        }
        System.out.println("Longest word: " + longestWord);
        sc.close();
    }
}
