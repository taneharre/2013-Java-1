import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // User input first number
        System.out.println("Type the first number: ");
        int firNum = Integer.parseInt(reader.nextLine());
        //User input second number
        System.out.println("Type the second number: ");
        int secNum = Integer.parseInt(reader.nextLine());
        // White Space
        System.out.println("");
        // Output result based on which is greater
        if (firNum > secNum){
            System.out.println("Greater number: " + firNum);
        } 
        else if (firNum < secNum){
            System.out.println("Greater number: " + secNum);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
