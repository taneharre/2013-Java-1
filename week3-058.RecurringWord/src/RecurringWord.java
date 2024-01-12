
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        
        boolean test = true;
        String input = "";
        
        while (test){
            System.out.print("Type a word: ");
            input = reader.nextLine();
            if (words.contains(input)) {
                test = false;
            }
            words.add(input);
            
        }
        
        System.out.println("You gave the word " + input + " twice");
    }
}
