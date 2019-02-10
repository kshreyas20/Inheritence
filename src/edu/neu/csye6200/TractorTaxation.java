package edu.neu.csye6200;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public class TractorTaxation {


    private int maxNumberOfTractor;// Max Rang can be set to 50 for proper formatting of the display
    private boolean displayWithRange; // To display range with tractor object

    private static Random random = new Random(); // creating random object
    private static int value; // Declaring variable to generate random numbers
    private ArrayList<Tractor> Tractarray = new ArrayList<>(); // Storing the tractor object
    private HashMap<String, Tractor> myMapTractor = new HashMap();

    private void addTractor(int maxNumberOfTractor) {

        String fuelType; // Storing the fuel type locally to generate random fuel type while creating a object

        if (maxNumberOfTractor > 0) {


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
                        value * 10.0D, value * 2D, value * 10000));

                if (Objects.equals(Tractarray.get(i).getMake(), "UNKNOWN")) {
                    Tractarray.remove(i);
                    i--;
                }
            }
        }
        else {
            System.out.println("Number of list is less than or equal to zero");
            System.out.println();
        }

    }

    private void removeTractor(int index){

        try {
            System.out.println();
            System.out.println();
            System.out.println("Removing the Tractor with" + Tractarray.get(index).getOwnerID());
            System.out.println();
            System.out.printf("%10s	%10s %10s %10s %10s %10s %10s   %10s", "MAKE", "MODEL", "POWER(KW/HP)", "FUEL-TYPE",
                    "CAPACITY(L/KW)", "CURRENT-FUEL(L/KW)", "OWNER_ID", "VALUE ($)");
            System.out.println();
            System.out.println();
            System.out.println(Tractarray.get(index));
            Tractarray.remove(index);
            System.out.println();
            System.out.println("Removed successfully");
            System.out.println();
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Entry not found int the Array list");
            System.out.println();
        }
    }

    private void displayTractor(){

        // Displaying the Tractor object

        System.out.printf("%10s	%10s %10s %10s %10s %10s %10s   %10s %20s   %10s       %10s  %10s", "MAKE", "MODEL", "POWER(KW/HP)", "FUEL-TYPE",
                "CAPACITY(L/KW)","CURRENT-FUEL(L/KW)","OWNER_ID","VALUE ($)", "MIN-RANGE(Km)", "CURRENT-RANGE(Km)", "MAX-RANGE(Km)", "FUEL_EFFICIENCY(Km/L Km/KW)");

        System.out.println();
        System.out.println();
        for (int i = 0; i < Tractarray.size(); i++) {

            value = random.nextInt(Tractarray.size());
            System.out.print(Tractarray.get(i));
            Tractarray.get(i).rangeBasedFuelLoadAndEfficiency(Tractarray.get(i).getCurrentFuelLoad(), value+1.0D, Tractarray.get(i).getCapacity());

            System.out.println();
        }

    }

    private void hashAddTractor(){

        System.out.printf("%10s	%10s %10s %10s %10s %10s %10s   %10s", "MAKE", "MODEL", "POWER(KW/HP)", "FUEL-TYPE",
                "CAPACITY(L/KW)","CURRENT-FUEL(L/KW)","OWNER_ID","VALUE ($)");
        System.out.println();
        System.out.println();
        for (int i = 0; i < Tractarray.size(); i++) {

            myMapTractor.put(Tractarray.get(i).getOwnerID(),Tractarray.get(i));

        }

        int i = 0;
        for (String key : myMapTractor.keySet())
        {
            System.out.println(myMapTractor.get(Tractarray.get(i).getOwnerID()));
            System.out.println();
            i++;

        }


    }
    private void taxTractor(int index){

        try {
            System.out.println();
            System.out.println("Calculating tax for Tractor with " + Tractarray.get(index).getOwnerID());
            System.out.println();
            System.out.printf("%10s	%10s %10s %10s %10s %10s %10s   %10s %10s ", "MAKE", "MODEL", "POWER(KW/HP)", "FUEL-TYPE",
                    "CAPACITY(L/KW)", "CURRENT-FUEL(L/KW)", "OWNER_ID", "VALUE ($)", "TAX");
            System.out.println();
            System.out.println();
            System.out.println(Tractarray.get(index) + "        " + Tractarray.get(index).getValue() / 1000);
            System.out.println();
            System.out.println("Tax Calculated successfully ");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Entry not found int the Array list");
            System.out.println();
        }



    }

    public static void main(String[] args) {

        TractorTaxation tractTax = new TractorTaxation();
        tractTax.addTractor(50);
        tractTax.displayTractor();
        tractTax.removeTractor(3);
        tractTax.displayTractor();
        tractTax.hashAddTractor();
        tractTax.taxTractor(1);


    }



}
