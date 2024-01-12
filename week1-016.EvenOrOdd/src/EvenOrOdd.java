
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here
        System.out.println("Type a number: "); //input number
        int inp = Integer.parseInt(reader.nextLine());
        int rem = inp % 2; // use modulo to find remainder

        // loop to output result based on remainder
        if (rem == 1 || rem == -1) {
            System.out.println("Number " + inp + " is odd.");
        } else {
            System.out.println("Number " + inp + " is even.");
        }
    }
}
