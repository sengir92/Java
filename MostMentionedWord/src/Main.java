import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // User enter sentence
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String str = input.nextLine();

        // Define the entered words in sentence into a new array by split method
        String[] words = str.split(" ");

        //Create new hashmap for words
        HashMap<String, Integer> wordMap = new HashMap<>();

        //for loop that adds how many times each word appears to the hashmap
        for (int i = 0; i < words.length; i++) {
            if (wordMap.containsKey(words[i])) {
                int count = wordMap.get(words[i]);
                count++;
                wordMap.put(words[i], count);
            } else {
                wordMap.put(words[i], 1);
            }

        }

        // Define new variables
        String mostMentionedWord = "";
        int maxCount = 0;

        //For loop that finds the most mentioned word and how many times its mentinoed
        for (String word : wordMap.keySet()) {
            int count = wordMap.get(word);
            if (count > maxCount) {
                maxCount = count;
                mostMentionedWord = word;
            }
        }
        System.out.println("Most mentioned word " + mostMentionedWord + " mentioned " + maxCount + " times");
    }
}
