import java.util.Scanner;

public class scanner3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter NSAT Score: ");
        double nsat = input.nextDouble();

        System.out.print("Enter Parents' Monthly Salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter Entrance Exam Score: ");
        double entrance = input.nextDouble();

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("Applicant is REJECTED");
        } else if (salary <= 3500 && (nsat + entrance) / 2 >= 91) {
            System.out.println("Applicant is ACCEPTED");
        } else {
            System.out.println("Application is for FURTHER STUDY");
        }

        input.close();
    }
}

