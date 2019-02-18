package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;


public class FrontLoader extends Tractor {


    private double width;
    private double loadercapacity;
    private static ArrayList<FrontLoader> FrontTractarray;


    public FrontLoader (String make, String model, double power, String fuelType, double capacity, double currentFuelLoad,double value,double width,double loadercapacity) {

        super(make, model, power, fuelType, capacity, currentFuelLoad, value);
        setWidth(width);
        setLoadercapacity(loadercapacity);
    }




    public void setWidth(double width) {
        if (width > 0.0D) {
            this.width = width;
        }
        else {
            this.width = 0.0D;
        }
    }


    public void setLoadercapacity(double loadercapacity) {
        if (loadercapacity > 0.0D) {
            this.loadercapacity = loadercapacity;
        }
        else {
            this.loadercapacity = 0.0D;
        }
    }

    public double getWidth() {
        return width;
    }
    public double getLoadercapacity() {
        return loadercapacity;
    }


    public static ArrayList<FrontLoader> createFrontTractarray(int maxNumberOfTractor) {


        Random random = new Random(); // creating random object
        int value; // Declaring variable to generate random number

        String fuelType;
        ArrayList<FrontLoader> FrontTractarray = new ArrayList<>();

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

            FrontTractarray.add(new FrontLoader("Make-" + 100 * value, "Model-" + 200 * value, value * 1000D, fuelType,
                    value*10.0D, value * 2D,value*10000,value,value*30));

            if(Objects.equals(FrontTractarray.get(i).getMake(), "UNKNOWN")){
                FrontTractarray.remove(i);
                i--;
            }
        }

        return FrontTractarray;

    }

    private static void Display(ArrayList<FrontLoader> Frontloader) {

        System.out.printf("%10s	%10s %10s %10s %10s %10s %10s   %10s %10s %10s", "MAKE", "MODEL", "POWER(KW/HP)", "FUEL-TYPE",
                "CAPACITY(L/KW)", "CURRENT-FUEL(L/KW)", "OWNER_ID", "VALUE ($)","WIDTH","LOADCAPACITY");
        for (int i=0;i < Frontloader.size();i++){

        System.out.print(FrontTractarray.get(i));
        System.out.printf("%10s	%10s",FrontTractarray.get(i).getWidth(),FrontTractarray.get(i).getLoadercapacity());

        System.out.println();
        System.out.println();
        }

    }

        public static void main(String[] args) {


        FrontTractarray = createFrontTractarray(5);
        Display(FrontTractarray);
    }
}
