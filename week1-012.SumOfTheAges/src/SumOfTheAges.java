
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");
        String name1 = reader.next();
        
        System.out.print("Type your age: ");
        int age1 = Integer.parseInt(reader.next());
        
        System.out.println("");
        
        System.out.print("Type your name: ");
        String name2 = reader.next();
        
        System.out.print("Type your age: ");
        int age2 = Integer.parseInt(reader.next());
        
        System.out.println("");
        
        System.out.println(name1 +" and " + name2 + " are " + (age1 + age2) +" years old in total.");
        
    }
}
