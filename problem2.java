public class problem2 { // Ito ang pangalan ng ating Java class.

    public static void main(String[] args) { // Dito nagsisimula ang program.

        double[] temperatures = new double[5]; // Gumagawa ng double array na may limang elements.

        temperatures[0] = 32.5; // Nilalagay ang 32.5 sa index 0 (Day 1).
        temperatures[1] = 34.0; // Nilalagay ang 34.0 sa index 1 (Day 2).
        temperatures[2] = 31.8; // Nilalagay ang 31.8 sa index 2 (Day 3).
        temperatures[3] = 33.2; // Nilalagay ang 33.2 sa index 3 (Day 4).
        temperatures[4] = 35.1; // Nilalagay ang 35.1 sa index 4 (Day 5).

        System.out.println("Daily Temperatures:"); // Nagpi-print ng heading.

        for (int i = 0; i < temperatures.length; i++) { // Inuulit ang pag-print gamit ang for loop hanggang sa huling index.

            System.out.println("Day " + (i + 1) + ": " + temperatures[i]); // Ipinapakita ang araw at temperatura nito.

        } // Dito nagtatapos ang for loop.

        temperatures[2] = 32.0; // Ina-update ang temperatura ng third day mula 31.8 papuntang 32.0.

        System.out.println("Updated Temperature for Day 3: " + temperatures[2]); // Ipinapakita ang updated temperature ng third day.

    } // Dito nagtatapos ang main method.

} // Dito nagtatapos ang Java class
