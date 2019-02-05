package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Shreyas Kambla NUID 001401937
 */

public class TractorTest {

    private int maxNumberOfTractor;// Max Rang can be set to 50 for proper formatting of the display
    private boolean displayWithRange; // To display range with tractor object

    private static Random random = new Random(); // creating random object
    private static int value; // Declaring variable to generate random numbers
    private static ArrayList<Tractor> Tractarray = new ArrayList<>(); // Storing the tractor object in array list for easy access of the stored object


    private TractorTest(int maxNumberOfTractor,boolean displayWithRange) {
        // TODO Auto-generated constructor stub
        this.maxNumberOfTractor = maxNumberOfTractor;
        this.displayWithRange = displayWithRange;
    }


    private void createTractor(){


        String fuelType; // Storing the fuel type locally to generate random fuel type while creating a object

        // creating max number of Tractor object
        for (int i = 0; i < maxNumberOfTractor; i++) {


            // Random value object is used to set make model and other parameters
            value = random.nextInt(maxNumberOfTractor);

            if (value % 3 == 0) {
                fuelType = "Electric";

            } else if (value % 2 == 0) {
                fuelType = "Diesel";
            } else {
                fuelType = "Petrol";
            }

            Tractarray.add(new Tractor("Make-" + 100 * value, "Model-" + 200 * value, value * 1000D, fuelType,
                    value*10.0D, value * 2D));
        }

    }

    // Display function only for range
    private void rangeDisplay(Tractor name, double fuelEfficiency) {


        name.rangeBasedFuelLoadAndEfficiency(name.getCurrentFuelLoad(), fuelEfficiency, name.getCapacity());

    }

    // Printing Column Method
    private void column () {

        // Printing Column if range field is enabled
        if (displayWithRange) {


        System.out.printf("%10s	%10s %10s %10s %10s %10s  %10s %10s   %10s  %10s", "MAKE", "MODEL", "POWER(KW/HP)", "FUEL-TYPE",
                "CAPACITY(L/KW)","CURRENT-FUEL(L/KW)", "MIN-RANGE(Km)", "CURRENT-RANGE(Km)", "MAX-RANGE(Km)", "FUEL_EFFICIENCY(Km/L Km/KW)");
        }
        else {
            System.out.printf("%10s	%10s %10s %10s %10s %10s", "MAKE", "MODEL", "POWER", "FUEL-TYPE",
                    "CAPACITY","CURRENT-FUEL(L/KW)");
        }

        System.out.println();
        System.out.println();
    }


    // Printing Tractor display
    private void tractorDisplay () {

        // Displaying the Tractor object
        for (int i = 0; i < maxNumberOfTractor; i++) {

            value = random.nextInt(10);
            System.out.print(Tractarray.get(i));

            // if range field is enabled - call display range as well
            if(displayWithRange) {

                rangeDisplay(Tractarray.get(i), value + 1.0D);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        TractorTest tractTest = new TractorTest(50,false); // Creating a TractorTest object to ca
        tractTest.createTractor();
        tractTest.column();
        tractTest.tractorDisplay();


    }

}
