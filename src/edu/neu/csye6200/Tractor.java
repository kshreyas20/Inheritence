package edu.neu.csye6200;

/**
 * @author Shreyas Kambla NUID 001401937
 */

public class Tractor {


    private String make;
    private String model;
    private double power;
    private String fuelType;
    private double capacity;
    private double currentFuelLoad;
    private String ownerID;
    private double value;
    private static long id = 0;


    // Constructor to create an object - assigning the value from the user

    public Tractor(String make, String model, double power, String fuelType, double capacity, double currentFuelLoad,double value) {

        if (make != null && model != null && power > 0.0D && fuelType != null && capacity > 0.0D && currentFuelLoad > 0.0D && currentFuelLoad < capacity && value > 1000.0D) {
            this.make = make;
            this.model = model;
            this.power = power; // Cant be less than zero
            this.fuelType = fuelType;
            this.capacity = capacity;// Cant be less than zero
            this.currentFuelLoad = currentFuelLoad; // cant be more than capacity and less than zero
            setOwnerID(); // Owner ID has to be unique key - if it needs to be store in HashMap
            this.value = value; // Cant be below 1000

        } else {

            System.out.println("WARNING: New Tractor doesnt meet the object criteria .Please enter valid inputs:    make:"+make+" model:"+model+" power:"+power+" fuelType:"+fuelType+" capacity:"+capacity+" currentFuel:"+currentFuelLoad+" value:"+value);
            this.make = "UNKNOWN";
            this.model = "UNKNOWN";
            this.power = 0.0D;
            this.fuelType = "UNKNOWN";
            this.capacity = 0.0D;
            this.currentFuelLoad = 0.0D;
            setOwnerID();
            this.value = 0.0D;
        }
    }

    /**
     * @return the capacity
     */

    public double getCapacity() {
        return capacity;
    }


    /**
     * @return the currentFuelLoad
     */

    public double getCurrentFuelLoad() { return currentFuelLoad; }

    /**
     * @return the OwnerID
     */

    public String getOwnerID() {
        return ownerID;
    }

    /**
     * @return the Value
     */

    public double getValue() {
        return value;
    }

    /**
     * @return the Make
     */

    public String getMake() {
        return make;
    }



    /**
     *  Setter - ownerID -> this method is used to generates unique OwnerID (example: HashMap uses Owner-ID to pull the object)
     */

    private void setOwnerID() {

        this.ownerID = "Owner-ID:" + id;

        id++;


    }



    // Method to calculate range based on fuel efficiency and load

    public void rangeBasedFuelLoadAndEfficiency(double currentFuelLoad, double fuelEfficiency, double capacity) {

        double[] range = new double[3];

        if (make.equals("UNKNOWN")) {
            fuelEfficiency = 0.0D;
        }

        range[0] = 0.01D * fuelEfficiency;// minimum range in Km
        range[1] = currentFuelLoad * fuelEfficiency; // current range in Km
        range[1] = currentFuelLoad * fuelEfficiency; // Maximum range in Km
        range[2] = capacity * fuelEfficiency;
        System.out.format("         	 	 %3.2f	     %10.2f           %10.2f  %10s", range[0], range[1], range[2], fuelEfficiency);
        System.out.println();

    }

    // String formatting based on the object inputs from test class

    public String toString() {
        System.out.println();
        return String.format("%10s	%10s %10.2f  %10s %10.2f    %10.2f  %20s %10.2f", make, model, power, fuelType, capacity,currentFuelLoad,ownerID,value);

    }


}

