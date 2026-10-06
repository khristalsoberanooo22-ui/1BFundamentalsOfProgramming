import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bufferedreader4 {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter height (cm): ");
        int height = Integer.parseInt(input.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(input.readLine());

        System.out.print("Enter citizenship code (C/N): ");
        char citizenship = input.readLine().charAt(0);

        System.out.print("Enter recommendee code (R/N): ");
        char recommendee = input.readLine().charAt(0);

        if (recommendee == 'R') {
            System.out.println("ACCEPTED");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("REJECTED");
        }
    }
}

