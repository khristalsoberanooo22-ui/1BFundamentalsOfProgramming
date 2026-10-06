import javax.swing.JOptionPane;

public class joption4 {
    public static void main(String[] args) {

        int height = Integer.parseInt(
                JOptionPane.showInputDialog("Enter height (cm):"));

        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter age:"));

        char citizenship = JOptionPane.showInputDialog(
                "Enter citizenship code (C/N):").charAt(0);

        char recommendee = JOptionPane.showInputDialog(
                "Enter recommendee code (R/N):").charAt(0);

        if (recommendee == 'R') {
            JOptionPane.showMessageDialog(null, "ACCEPTED");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
            JOptionPane.showMessageDialog(null, "ACCEPTED");
        } else {
            JOptionPane.showMessageDialog(null, "REJECTED");
        }
    }
}
