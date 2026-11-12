import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader {
    public static void main(String[] args) throws IOException {

        java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter year: ");
        int year = Integer.parseInt(br.readLine());

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
