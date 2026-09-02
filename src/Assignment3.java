import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        double people = input.nextDouble();

        double scalingFactor = people / 4;

        double flour = 2 * scalingFactor;
        double sugar = 1 * scalingFactor;
        double eggs = 2 * scalingFactor;

        System.out.println("Flour: " + flour + " cups");
        System.out.println("Sugar: " + sugar + " cups");
        System.out.println("Eggs: " + eggs);
    }
}