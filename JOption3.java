import javax.swing.JOptionPane;

public class JOption3 {
    public static void main(String[] args) {

        double nsat = Double.parseDouble(
                JOptionPane.showInputDialog("Enter NSAT score:")
        );

        double salary = Double.parseDouble(
                JOptionPane.showInputDialog("Enter parents' monthly salary:")
        );

        double entrance = Double.parseDouble(
                JOptionPane.showInputDialog("Enter entrance exam score:")
        );

        double average = (nsat + entrance) / 2;

        String status;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            status = "Rejected";
        } else if (salary <= 3500 && average >= 91) {
            status = "Accepted";
        } else {
            status = "Further Study";
        }

        JOptionPane.showMessageDialog(
                null,
                "NSAT Score: " + nsat +
                        "\nParents' Salary: Php " + salary +
                        "\nEntrance Exam Score: " + entrance +
                        "\nAverage: " + average +
                        "\nApplication Status: " + status
        );
    }
}

