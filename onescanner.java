import java.util.Scanner;

public class onescanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, highest, lowest;

        System.out.print("Enter number 1: ");
        num = input.nextInt();

        highest = num;
        lowest = num;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            num = input.nextInt();

            if (num > highest) {
                highest = num;
            }

            if (num < lowest) {
                lowest = num;
            }
        }

        System.out.println("\nHighest Number: " + highest);
        System.out.println("Lowest Number: " + lowest);

        input.close();
    }
}
