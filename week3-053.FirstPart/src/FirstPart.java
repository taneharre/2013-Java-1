
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("Length of the first part: ");
        int length = Integer.parseInt(reader.nextLine());

        System.out.print("Result: ");

        int i = 0;

        while (i < length) {
            System.out.print(word.charAt(i));
            i++;
        }
        System.out.println("");
    }
}