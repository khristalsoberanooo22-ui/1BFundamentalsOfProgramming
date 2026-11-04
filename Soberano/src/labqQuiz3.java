import javax.swing.JOptionPane;

public class labqQuiz3 {
    public static void main(String[] args){
        String salarybefore= "" ;
        salarybefore = JOptionPane.showInputDialog("My salary before is 209");

        String msgg = "My salary before is 209";
        JOptionPane.showMessageDialog(null, msgg);

        String next = "" ;
        next = JOptionPane.showInputDialog("My salary after the increase is 2098");

        String msg = "2098";
        JOptionPane.showMessageDialog(null, msg);


    }
}

