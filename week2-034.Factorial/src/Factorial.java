import java.util.Scanner;

 

public class Factorial {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

 

        System.out.print("Type a number:  ");

        int n = Integer.parseInt(reader.nextLine());

        int factorial = 1;

        

        int number = 1;

        while (number <= n) {

            factorial *= number;

            number++;

        }

        

        System.out.println("The result is" + factorial);

    }

}
