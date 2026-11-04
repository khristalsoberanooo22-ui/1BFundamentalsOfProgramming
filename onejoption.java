import javax.swing.JOptionPane;

public class onejoption {
    public static void main(String[] args) {

        int num, highest, lowest;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Enter number 1:")
        );

        highest = num;
        lowest = num;

        for (int i = 2; i <= 10; i++) {

            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter number " + i + ":")
            );

            if (num > highest) {
                highest = num;
            }

            if (num < lowest) {
                lowest = num;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Highest Number: " + highest +
                        "\nLowest Number: " + lowest);
    }
}

