// Inverted Pyramid
import java.util.Scanner;
import java.util.InputMismatchException;

public class labReci {
    public static void main (String[] args){
        Scanner calc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = calc.nextInt();

        for (int a = number; a >= 1; a--){
            for (int b = 1; b <= number - a; b++){
                System.out.print(" ");
            }
            for (int c = 1; c <= (a * 2) - 1; c++){
                System.out.print("+");
            }
            System.out.println("");
        }
    }
}
