
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.
        while (true) {
            System.out.println("Enter a number: ");
            double number = Double.parseDouble(reader.nextLine());
            if (number > -30) {
                if (number < 40) {
                    Graph.addNumber(number);
                }
            }

        }
        // Remove or comment out these lines above before trying to run the tests.
    }
}
