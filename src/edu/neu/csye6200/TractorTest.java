package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * @author Shreyas Kambla NUID 001401937
 */

public class TractorTest {

    private static Random random = new Random(); // creating random object
    private static int value; // Declaring variable to generate random numbers
    private ArrayList<Tractor> Tractarray; // Storing the tractor object in array list for easy access of the stored object




    // Constructor to store Tractor object in Array list

    public  TractorTest(int maxNumberOfTractor){

        if (maxNumberOfTractor > 0) {

            setTractarray(maxNumberOfTractor);
        }
        else {
            System.out.println("Max Tractor is either zero or less than zero");
        }

    }

    // Setting Array list to store the Tractor objects .

    private void setTractarray(int maxNumberOfTractor) {

        String fuelType; // Storing the fuel type locally to generate random fuel type while creating a object
        ArrayList<Tractor> tractarray = new ArrayList<>();

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

            tractarray.add(new Tractor("Make-" + 100 * value, "Model-" + 200 * value, value * 1000D, fuelType,
                    value*10.0D, value * 2D,value*10000));

            if(Objects.equals(tractarray.get(i).getMake(), "UNKNOWN")){
              tractarray.remove(i);
                i--;
            }
        }
        this.Tractarray=tractarray;


    }

    // get the array list from this class

    public ArrayList<Tractor> getTractarray() {
        return Tractarray;
    }

    // Display tractor object and the range
    private void rangeDisplay(ArrayList<Tractor> tractarray) {

        System.out.printf("%10s	%10s %10s %10s %10s %10s %10s   %10s", "MAKE", "MODEL", "POWER(KW/HP)", "FUEL-TYPE",
                "CAPACITY(L/KW)","CURRENT-FUEL(L/KW)","OWNER_ID","VALUE ($)");

        System.out.printf(" %20s   %10s       %10s  %10s","MIN-RANGE(Km)", "CURRENT-RANGE(Km)", "MAX-RANGE(Km)", "FUEL_EFFICIENCY(Km/L Km/KW)");

        System.out.println();
        System.out.println();
        try {
            for (Tractor tractor : tractarray) {

                value = random.nextInt(10);// inserting random value to for fuel efficiency for range display
                System.out.print(tractor);
                tractor.rangeBasedFuelLoadAndEfficiency(tractor.getCurrentFuelLoad(), value + 1.0D, tractor.getCapacity());
                System.out.println();
            }
        }catch (NullPointerException e){
            System.out.println("EXCEPTION:List is not defined or list size is zero");
        }

    }



    // run  method to display and create the 5 objects
    private static void run(){

        TractorTest tractTest = new TractorTest(5); // Creating a TractorTest object of tractor max value 50
        tractTest.rangeDisplay(tractTest.Tractarray);


    }


    public static void main(String[] args) {

        run();




    }

}
