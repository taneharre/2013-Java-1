
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int inputNum = Integer.parseInt(reader.nextLine());
        int tick = 0;
        int result = 0;
        
        while (tick <= inputNum){
            result += (int)Math.pow(2, tick);
            tick++;
        }
        
        System.out.println("The result is " + result);
    }
}
