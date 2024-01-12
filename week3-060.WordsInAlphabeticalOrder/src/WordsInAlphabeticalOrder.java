
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();

        System.out.print("Type a word: ");
        String input = reader.nextLine();
        words.add(input);

        while (input.length() != 0) {
            System.out.print("Type a word: ");
            input = reader.nextLine();

            words.add(input);
        }

        Collections.sort(words);

        System.out.print("You typed the following words:");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
