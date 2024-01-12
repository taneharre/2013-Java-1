
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int output = 1;
        System.out.print("Up to what number? ");
        int number = Integer.parseInt(reader.nextLine());
        
        while (output <= number){
            System.out.println(output);
            output++;
        }
        
    }
}
