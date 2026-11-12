//Ini-import ang Arrays para magamit ang deepToString()
import java.util.Arrays;

//Main class ng program
public class problem1 {

    //Main method kung saan magsisimula ang program
    public static void main(String[] args) {

        //Gumagawa ng 2D String array na may 2 rows at 3 columns
        String[][] seats = {
                {"Alice", "Bob", "Charlie"},
                {"David", "Emma", "Frank"}
        };
        //Ipinapakita ang pangalan ng nakaupo sa second row, third column
        //Ang index na 1 ay second row at 2 ay third column
        System.out.println("Second row, third column: " + seats[1][2]);

        // Pinapalitan ang pangalan ni Bob ng Vacant
        // Ang index na 0 ay first row at 1 ay second column
        seats[0][1] = "Vacant";

        // Ipinapakita ang buong seating arrangement gamit ang deepToString()
        System.out.println("Updated Seating Chart: " + Arrays.deepToString(seats));
    }
}
