package edu.neu.csye6200;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.io.BufferedReader;

import static java.lang.Double.valueOf;


public class TractorIO {

    private static ArrayList <Object> TractorIOArray = new ArrayList<>() ;

    private static ArrayList<FrontLoader> FrontTractarray;
   ;

    private void save (Tractor tractor,String filename) {


        try {
            String base = "/Users/shruthiarun/Desktop/shreyasassginment/Spring 2019/java/csye6200/src/edu/neu/csye6200/";
            FileWriter writer = new FileWriter(base + filename);
         //  writer.write("\n");
           /* writer.write("Tractor"+"\n");
            writer.write("Model:"+tractor.getModel()+"\n");
            writer.write("Make:"+tractor.getMake()+"\n");
            writer.write("power:"+ tractor.getPower()+"\n");
            writer.write("fuelType"+tractor.getFuelType()+"\n");
            writer.write("Capacity:"+tractor.getCapacity()+"\n");
            writer.write("Owner-ID:"+tractor.getOwnerID()+"\n");
            writer.write("CurrentFuelLoad:"+tractor.getCurrentFuelLoad()+"\n");
            writer.write("value:"+tractor.getValue()+"\n");
            writer.write("\n");*/
            writer.write("Tractor"+"\n");
            writer.write(tractor.getMake()+"\n");
            writer.write(tractor.getModel()+"\n");
            writer.write(tractor.getPower()+"\n");
            writer.write(tractor.getFuelType()+"\n");
            writer.write(tractor.getCapacity()+"\n");
            writer.write(tractor.getCurrentFuelLoad()+"\n");
            writer.write(tractor.getValue()+"\n");
            writer.write(tractor.getOwnerID()+"\n");
            writer.write("\n");

            writer.close();

        }
        catch (FileNotFoundException e){
            System.out.println("EXCEPTION: Can't open the file");
        }
        catch (IOException e) {

            System.out.println("EXCEPTION: general file expection");

        }



    }


    public void save (ArrayList<Object> tractor, String filename){

        try {


            String base = "/Users/shruthiarun/Desktop/shreyasassginment/Spring 2019/java/csye6200/src/edu/neu/csye6200/";
            FileWriter writer = new FileWriter(base + filename);

            for (int i = 0; i < tractor.size(); i++) {

                if (tractor.get(i) instanceof FrontLoader) {

                  //  System.out.println("Front");
                  /*  writer.write("FrontLoader"+"\n");
                    writer.write("Make:" + ((FrontLoader) tractor.get(i)).getMake() + "\n");
                    writer.write("Model:" + ((FrontLoader) tractor.get(i)).getModel() + "\n");
                    writer.write("power" + ((FrontLoader) tractor.get(i)).getPower() + "\n");
                    writer.write("fuelType" + ((FrontLoader) tractor.get(i)).getFuelType() + "\n");
                    writer.write("Capacity:" + ((FrontLoader) tractor.get(i)).getCapacity() + "\n");
                    writer.write("CurrentFuelLoad:"+((FrontLoader)tractor.get(i)).getCurrentFuelLoad()+"\n");
                    writer.write("value" + ((FrontLoader) tractor.get(i)).getValue() + "\n");
                    writer.write("Width:" + ((FrontLoader) tractor.get(i)).getWidth() + "\n");
                    writer.write("LoadCapacity:" + ((FrontLoader) tractor.get(i)).getLoadercapacity() + "\n");
                    writer.write("Owner-ID:" + ((FrontLoader) tractor.get(i)).getOwnerID() + "\n");
                    writer.write("\n");*/
                    writer.write("FrontTractor"+"\n");
                    writer.write(((FrontLoader) tractor.get(i)).getMake() + "\n");
                    writer.write( ((FrontLoader) tractor.get(i)).getModel() + "\n");
                    writer.write( ((FrontLoader) tractor.get(i)).getPower() + "\n");
                    writer.write(((FrontLoader) tractor.get(i)).getFuelType() + "\n");
                    writer.write(((FrontLoader) tractor.get(i)).getCapacity() + "\n");
                    writer.write(((FrontLoader)tractor.get(i)).getCurrentFuelLoad()+"\n");
                    writer.write( ((FrontLoader) tractor.get(i)).getValue() + "\n");
                    writer.write(((FrontLoader) tractor.get(i)).getWidth() + "\n");
                    writer.write(((FrontLoader) tractor.get(i)).getLoadercapacity() + "\n");
                    writer.write( ((FrontLoader) tractor.get(i)).getOwnerID() + "\n");
                    writer.write("\n");


                } else {
                   // System.out.println("Track");
                   /* writer.write("Tractor"+"\n");
                    writer.write("Make:" + ((Tractor) tractor.get(i)).getMake() + "\n");
                    writer.write("Model:" + ((Tractor) tractor.get(i)).getModel() + "\n");
                    writer.write("power:" + ((Tractor) tractor.get(i)).getPower() + "\n");
                    writer.write("fuelType:" + ((Tractor) tractor.get(i)).getFuelType() + "\n");
                    writer.write("Capacity:" + ((Tractor) tractor.get(i)).getCapacity() + "\n");
                    writer.write("CurrentFuelLoad:"+((Tractor) tractor.get(i)).getCurrentFuelLoad()+"\n");
                    writer.write("value:" + ((Tractor) tractor.get(i)).getValue() + "\n");
                    writer.write("Owner-ID:" + ((Tractor) tractor.get(i)).getOwnerID() + "\n");
                    writer.write("\n");*/
                    writer.write("Tractor"+"\n");
                    writer.write(((Tractor) tractor.get(i)).getMake() + "\n");
                    writer.write(((Tractor) tractor.get(i)).getModel() + "\n");
                    writer.write( ((Tractor) tractor.get(i)).getPower() + "\n");
                    writer.write(((Tractor) tractor.get(i)).getFuelType() + "\n");
                    writer.write(((Tractor) tractor.get(i)).getCapacity() + "\n");
                    writer.write(((Tractor) tractor.get(i)).getCurrentFuelLoad()+"\n");
                    writer.write(((Tractor) tractor.get(i)).getValue() + "\n");
                    writer.write( ((Tractor) tractor.get(i)).getOwnerID() + "\n");
                    writer.write("\n");


                }
            }
            writer.close();
        }
        catch(IOException e) {

            System.out.println("EXCEPTION: general file expection");

        }

    }


    public void saveArray (Object tractor) {

        TractorIOArray.add(tractor);

    }

    public void createTractor (int maxNumberofTractor){

        TractorTest tractTest = new TractorTest(maxNumberofTractor);
        for (int i=0;i<tractTest.getTractarray().size();i++){

            saveArray((Object) tractTest.getTractarray().get(i));
            System.out.print(tractTest.getTractarray().get(i));
            System.out.println("");
        }
    }

    public void createFronloader(int maxNumberofFrontloader){


        Random random = new Random(); // creating random object
        int value; // Declaring variable to generate random number
        String fuelType;
        ArrayList<FrontLoader> FrontTractarray = new ArrayList<>();

        for (int i = 0; i < maxNumberofFrontloader; i++) {


            // Random value object is used to set make model and other parameters
            value = random.nextInt(maxNumberofFrontloader);

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
            }else {

                saveArray((Object) FrontTractarray.get(i));
            }

        }

    }

    public void load (String filename){

        BufferedReader br = null;
        ArrayList<Tractor> tractLoad = new ArrayList<>();
        ArrayList<FrontLoader> frontLoader = new ArrayList<>();
        int i =0;
        int j=0;
        String stringLine;

        try {
            br = new BufferedReader( new FileReader(filename));

            while( (stringLine = br.readLine()) != null) {

                if (stringLine.equals("Tractor")){
                    tractLoad.add(i,(new Tractor((br.readLine()),(br.readLine()),Double.parseDouble((br.readLine())),(br.readLine()), Double.parseDouble((br.readLine())), Double.parseDouble((br.readLine())),Double.parseDouble((br.readLine())))));
                    tractLoad.get(i).setOwnerID(br.readLine());
                    System.out.print(tractLoad.get(i));
                    i++;
                    br.readLine();
                }
                else if (stringLine.equals("FrontTractor")){

                    frontLoader.add(j,(new FrontLoader((br.readLine()),(br.readLine()),Double.parseDouble((br.readLine())),(br.readLine()), Double.parseDouble((br.readLine())), Double.parseDouble((br.readLine())),Double.parseDouble((br.readLine())),Double.parseDouble((br.readLine())),Double.parseDouble((br.readLine())))));
                    frontLoader.get(j).setOwnerID(br.readLine());
                    System.out.print(frontLoader.get(j));
                    System.out.printf("%10s	%10s",frontLoader.get(j).getWidth(),frontLoader.get(j).getLoadercapacity());
                    j++;
                    br.readLine();
                }
            }

        }catch (IOException e ) {
            System.err.println("Unable to read the file: fileName "+filename);
        }
    }



    public static void main(String[] args) {

        TractorIO fileTract = new TractorIO();
        Tractor tractorIO = new Tractor("Make-IO","Model-IO",1000.0D,"Electric",100.0D,20.0D,3000.0D);
        fileTract.save(tractorIO,"singleTractor");
        fileTract.createTractor(5);
        fileTract.createFronloader(5);
        fileTract.save(TractorIOArray,"Tractor");
        fileTract.load("/Users/shruthiarun/Desktop/shreyasassginment/Spring 2019/java/csye6200/src/edu/neu/csye6200/singleTractor");
        fileTract.load("/Users/shruthiarun/Desktop/shreyasassginment/Spring 2019/java/csye6200/src/edu/neu/csye6200/Tractor");

    }


}
