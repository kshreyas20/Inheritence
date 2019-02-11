package edu.neu.csye6200;


import java.util.ArrayList;
import java.util.HashMap;

public class TractorTaxation  {

    //Instance variable to store Tractor class in Array as we as in HashMap

    private ArrayList<Tractor> TaxTractarray; // Storing the tractor object
    private HashMap<String, Tractor> MapTractor = new HashMap<>();


    // Constructor to create a TractorTax object

    private TractorTaxation(int maxNumberOfTractor){

        setTaxTractarray(maxNumberOfTractor);
        setMyMapTractor();

    }


    // Setter to store the objects in Array list

    private void setTaxTractarray(int maxNumberOfTractor) {
        TractorTest testTractor = new TractorTest(maxNumberOfTractor);
        this.TaxTractarray =testTractor.getTractarray();
    }

    // Setter to store already object in Array list to hash Map

    private void setMyMapTractor() {

        try {


            if (TaxTractarray.size() > 0) {
                for (Tractor tractor : this.TaxTractarray) {

                    this.MapTractor.put(tractor.getOwnerID(), tractor);

                }
            }
        }catch (NullPointerException e){
            System.out.println("EXCEPTION:SET HASH MAP method Tractor ArrayList is not defined");
            System.out.println();
        }


    }


    // get the  Array list

    private ArrayList<Tractor> getTaxTractarray() {
        return TaxTractarray;
    }

    // get the hashMap

    private HashMap<String, Tractor> getMapTractor() {
        return MapTractor;
    }


    // Get the object in Array list based on index

    private void getTractor(int index){

        try {
            System.out.println();
            System.out.printf("%10s	%10s %10s %10s %10s %10s %10s   %10s", "MAKE", "MODEL", "POWER(KW/HP)", "FUEL-TYPE",
                    "CAPACITY(L/KW)", "CURRENT-FUEL(L/KW)", "OWNER_ID", "VALUE ($)");
            System.out.println();
            System.out.println();
            System.out.println(getTaxTractarray().get(index));
        }catch (IndexOutOfBoundsException e){
            System.out.println("EXCEPTION:GET-TRACTOR method Entry not found in the Array list");
            System.out.println();
        }
        catch (NullPointerException e){
            System.out.println("EXCEPTION:GET-TRACTOR method Tractor ArrayList is not defined");
            System.out.println();
        }

    }


    // Remove the object in Array list based on index

    private void removeTractor(int index){

        try {
            System.out.println();
            System.out.println();
            System.out.println("Removing the Tractor with" + TaxTractarray.get(index).getOwnerID());
            getTractor(index);
            getTaxTractarray().remove(index);
            System.out.println();
            System.out.println("Removed successfully");
            System.out.println();
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("EXCEPTION:REMOVE-TRACTOR method Entry not found in the Array list");
            System.out.println();
        }
        catch (NullPointerException e){
            System.out.println("EXCEPTION:REMOVE-TRACTOR method Tractor ArrayList is not defined");
            System.out.println();
        }
    }

    //Add the object in Array list based on index - Note : You can't add

    private void addTractor(int index, Tractor tractor) {

        try {
            System.out.println();
            System.out.println("Adding the New Tractor to index:" + index);
            getTaxTractarray().add(index, tractor);
            getTractor(index);
            System.out.println();
            System.out.println("Added successfully");
            System.out.println();
            getMapTractor().put(getTaxTractarray().get(index).getOwnerID(), tractor);
        }
        catch (NullPointerException e){
            System.out.println("EXCEPTION:ADD-TRACTOR method Tractor ArrayList is not defined");
            System.out.println();
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("EXCEPTION: ADD-TRACTOR method Entry not found in the Array list");
            System.out.println();
        }
    }



    // Displaying the Tractor object

    private void displayTractor(){

        try {
            System.out.printf("%10s	%10s %10s %10s %10s %10s %10s   %10s", "MAKE", "MODEL", "POWER(KW/HP)", "FUEL-TYPE",
                    "CAPACITY(L/KW)", "CURRENT-FUEL(L/KW)", "OWNER_ID", "VALUE ($)");

            System.out.println();
            System.out.println();

            TaxTractarray.forEach(System.out::print);
            System.out.println();
        }catch (NullPointerException e){
            System.out.println("EXCEPTION: DISPLAY-TRACTOR method Tractor ArrayList is not defined");
            System.out.println();
        }
    }

    // Method to retrieve the object from HashMap using Keys as Owner-ID

    private void retrievalMap(String ownerID){



        System.out.println();
        System.out.println("Retrieving OwnerID from MAP");
        System.out.println();
        if(getMapTractor().containsKey(ownerID)) {
            System.out.printf("%10s	%10s %10s %10s %10s %10s %10s   %10s", "MAKE", "MODEL", "POWER(KW/HP)", "FUEL-TYPE",
                    "CAPACITY(L/KW)", "CURRENT-FUEL(L/KW)", "OWNER_ID", "VALUE ($)");

            System.out.println();
            System.out.println();
            System.out.println(getMapTractor().get(ownerID));
            System.out.println();
            System.out.println("Retrieved successfully ");
            System.out.println();
        }
        else{
            System.out.println("ERROR:Owner-ID not found");
        }

    }


    // Method to display tax of the tractors

    private void taxTractor(){

        try {
            System.out.println();
            System.out.printf("%10s	%10s %10s %10s %10s %10s %10s   %10s %10s ", "MAKE", "MODEL", "POWER(KW/HP)", "FUEL-TYPE",
                    "CAPACITY(L/KW)", "CURRENT-FUEL(L/KW)", "OWNER_ID", "VALUE ($)", "TAX");
            System.out.println();
            System.out.println();
           // getTaxTractarray().forEach((tractor) -> System.out.println(tractor + "        " + tractor.getValue() / 1000));

            // Calculation based on slabs
            for (Tractor tractor : this.TaxTractarray) {

                if(tractor.getValue() <= 10000){
                    System.out.println(tractor + "        " + tractor.getValue()*5 / 100);

                }
                else if (tractor.getValue() <= 30000){

                    System.out.println(tractor + "        " + tractor.getValue()*10 / 100);

                }
                else {

                    System.out.println(tractor + "        " + tractor.getValue()*15 / 100);
                }

            }

            System.out.println();
            System.out.println("Tax Calculated successfully ");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("EXCEPTION:Entry not found int the Array list");
            System.out.println();
        }
        catch (NullPointerException e){
            System.out.println("EXCEPTION: TAX-TRACTOR method Tractor ArrayList is not defined");
            System.out.println();
        }

    }

    public static void main(String[] args) {

        TractorTaxation taxTract = new TractorTaxation(5);
        taxTract.displayTractor();
        taxTract.getTractor(1);
        taxTract.removeTractor(2);
        taxTract.displayTractor();
        taxTract.addTractor(3,new Tractor("Make-New","Model-New",5000,"Petrol",50,6,50000));
        taxTract.displayTractor();
        taxTract.retrievalMap("Owner-ID:2");
        taxTract.taxTractor();

    }



}
