import java.util.Scanner;

public class threescanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 20000;
        double amount;

        System.out.println("Starting Balance: " + balance);

        while (true) {

            System.out.print("\nEnter amount (0 to stop): ");
            amount = input.nextDouble();

            if (amount == 0) {
                break;
            }

            if (amount > 0) {
                balance += amount;

            } else if (amount < 0) {

                if (Math.abs(amount) <= balance) {
                    balance += amount;
                } else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }

            System.out.printf("Outstanding Balance: P%.2f%n", balance);
        }

        System.out.printf("\nFinal Balance: P%.2f%n", balance);

        input.close();
    }
}

