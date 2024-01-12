import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int num = 0;
        int sum = 0;
        int tic = -1;
        int even = -1;

        while (num != -1) {
            sum += num;
            tic++;
            
            if (num%2 == 0){
                even++;
            }
            num = Integer.parseInt(reader.nextLine());
        }

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + tic);
        System.out.println("Average: " + ((double)sum / tic));
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + (tic - even));

    }
}
