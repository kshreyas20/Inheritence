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


    /**
     * @return the capacity
     */
    public double getCapacity() {
        return capacity;
    }


    /**
     * @return the currentFuelLoad
     */
    public double getCurrentFuelLoad() {
        return currentFuelLoad;
    }


    /**
     * @param currentFuelLoad the currentFuelLoad to set - Code is for future purpose if the user wants to update the current fuel Load
     */
    public void setCurrentFuelLoad(double currentFuelLoad) {
        if (currentFuelLoad > 0.0D && currentFuelLoad < capacity) {
            this.currentFuelLoad = currentFuelLoad;
        } else {
            this.currentFuelLoad = 0.0D;
        }
    }

    // Default constructor
    public Tractor() {

        this.make = "UNKNOWN";
        this.model = "UNKNOWN";
        this.power = 0.0D;
        this.fuelType = "UNKNOWN";
        this.capacity = 0.0D;
        this.currentFuelLoad = 0.0D;

    }

    // Full fledged constructor

    public Tractor(String make, String model, double power, String fuelType, double capacity, double currentFuelLoad) {

        if (make != null && model != null && power > 0.0D && fuelType != null && capacity > 0.0D && currentFuelLoad > 0.0D && currentFuelLoad < capacity) {
            this.make = make;
            this.model = model;
            this.power = power;
            this.fuelType = fuelType;
            this.capacity = capacity;
            this.currentFuelLoad = currentFuelLoad;

        } else {
            this.make = "UNKNOWN";
            this.model = "UNKNOWN";
            this.power = 0.0D;
            this.fuelType = "UNKNOWN";
            this.capacity = 0.0D;
            this.currentFuelLoad = 0.0D;

        }
    }

    // Method to calculate range based on fuel efficiency and load
    public void rangeBasedFuelLoadAndEfficiency(double currentFuelLoad, double fuelEfficiency, double capacity) {

        double[] range = new double[3];
        if (make.equals("UNKNOWN")) {
            fuelEfficiency = 0.0D;
        }
        range[0] = 0.01D * fuelEfficiency;
        range[1] = currentFuelLoad * fuelEfficiency;
        range[1] = currentFuelLoad * fuelEfficiency;
        range[2] = capacity * fuelEfficiency;
        System.out.format("         	 	 %3.2f	     %10.2f           %10.2f  %10s", range[0], range[1], range[2], fuelEfficiency);
        System.out.println();

    }

    // String formatting based on the object inputs from test class
    public String toString() {

        return String.format("%10s	%10s %10.2f  %10s %10.2f    %10.2f", make, model, power, fuelType, capacity,currentFuelLoad);

    }

}

