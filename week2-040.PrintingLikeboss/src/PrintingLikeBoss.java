public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0) {
            System.out.print("*");
            amount--;

        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while (amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int star = 1;
        int tick = size;
        while (tick >= star) {
            printWhitespaces(size - 1);
            printStars(star);
            size--;
            star++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int stars = 1;
        while (height > 0) {
            printWhitespaces(height -1);
            printStars(stars);
            stars += 2;
            height--;
        }
        printWhitespaces(stars / 2 - 2);
        printStars(3);
        printWhitespaces(stars / 2 - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
