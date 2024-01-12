import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int tick = 0;
        while ((tick < 3) && (name.length() > 2)) {
            System.out.println((tick +1) + ". character: " + name.charAt(tick));
            tick++;

        }
    }
}
