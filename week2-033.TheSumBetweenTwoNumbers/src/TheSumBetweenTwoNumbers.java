
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First? ");
        int first = Integer.parseInt(reader.nextLine());
        
                System.out.print("Last? ");
        int last = Integer.parseInt(reader.nextLine());
        
        int tick = first;
        int sum = first;
        
        while (last > tick){
            sum = sum + tick;
            sum++;
            tick++;
        }
        
        System.out.println("Sum is " + sum);
        
    }
}
