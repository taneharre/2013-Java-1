
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you? ");           //user inputs age
        int age = Integer.parseInt(reader.nextLine());
        
        if (age > (-1) &amp;&amp; age &lt; 121){
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }
}
