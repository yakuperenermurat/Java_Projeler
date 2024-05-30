package week5;

import java.util.HashMap;
import java.util.Scanner;

public class MostMentionedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();

        // Split text into words
        String[] words = text.split("[\\s,\\.]+");

        // Creating a HashMap to store words

        HashMap<String, Integer> wordCounts = new HashMap<>();

        // Finding the counts of each word
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        // Finding the most common word
        String mostMentionedWord = "";
        int mostMentionedWordCounts = 0;
        for (String word : wordCounts.keySet()) {
            int wordCount = wordCounts.get(word);
            if (wordCount > mostMentionedWordCounts) {
                mostMentionedWord = word;
                mostMentionedWordCounts = wordCount;
            }
        }

        // Printing the result to the screen
        System.out.println("Most repeated word: " + mostMentionedWord + ", Count: " + mostMentionedWordCounts);
    }
}
