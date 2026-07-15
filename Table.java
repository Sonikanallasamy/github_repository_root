import java.util.Random;
import java.util.Scanner;
public class Table {
    public static void printBorder(int size) {
        System.out.print("   +");
        for (int i = 0; i < size; i++) {
            System.out.print("-----+");
        }
        System.out.println();
    }
    public static void printBorderHighlight(int size) {
        System.out.print("   +");
        for (int i = 0; i < size; i++) {
            System.out.print("------+");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int size = 0;
        while (true) {
            System.out.print("Enter array size (for P×P array): ");
            if (sc.hasNextInt()) {
                size = sc.nextInt();
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Array size must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                sc.next();
            }
        }
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (random.nextInt(8) + 1) * 2;
            }
        }
        System.out.println("\nGenerated 2D array:\n");
        System.out.print("    ");
        for (int j = 0; j < size; j++) {
            System.out.printf("%02d   ", j);
        }
        System.out.println();
        printBorder(size);
        for (int i = 0; i < size; i++) {
            System.out.printf("%02d |", i);
            for (int j = 0; j < size; j++) {
                System.out.printf(" %2d |", array[i][j]);
            }
            System.out.println();
            printBorder(size);
        }
        int highlight = 0;
        while (true) {
            System.out.print("\nEnter a number to highlight (even number 2-16): ");
            if (sc.hasNextInt()) {
                highlight = sc.nextInt();

                if (highlight >= 2 && highlight <= 16 && highlight % 2 == 0) {
                    break;
                } else {
                    System.out.println("Please enter an even number between 2 and 16.");
                }
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                sc.next();
            }
        }
        int count = 0;
        System.out.println("\nArray with " + highlight + " highlighted:\n");
        System.out.print("    ");
        for (int j = 0; j < size; j++) {
            System.out.printf("%02d    ", j);
        }
        System.out.println();
        printBorderHighlight(size);
        for (int i = 0; i < size; i++) {
            System.out.printf("%02d |", i);
            for (int j = 0; j < size; j++) {

                if (array[i][j] == highlight) {
                    System.out.printf("[%2d]|", array[i][j]);
                    count++;
                } else {
                    System.out.printf(" %2d  |", array[i][j]);
                }
            }
            System.out.println();
            printBorderHighlight(size);
        }
        System.out.println("\nNumber " + highlight + " appeared " + count + " time(s).");
        sc.close();
    }
}