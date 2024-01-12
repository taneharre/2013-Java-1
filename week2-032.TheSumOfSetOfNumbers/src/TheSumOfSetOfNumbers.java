
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Until what? ");
        int input = Integer.parseInt(reader.nextLine());
        
        int tick = 1;
        int sum = 1;
        
        while (input > tick){
            sum = sum + tick;
            sum++;
            tick++;
        }
        
        System.out.println("Sum is " + sum);

    }
}
