
import java.util.ArrayList;

public class Kennel {

    private ArrayList<PetAnimal> petList = new ArrayList<PetAnimal>();

    // Constructor
    public Kennel() {
    }

    // Do work here
    public void run (){
        add(new Dog("Fido"));
        add(new Dog("Thor"));
        add(new Dog("Fenja"));

    }

    // Add a Pet Animal
    public void add (PetAnimal petAnimal) {
        System.out.println("Add animal name "+petAnimal.getName()+" id: "+ petAnimal.getId());
        petList.add(petAnimal);
    }

    // List all the pets
    private void list (){
        for(PetAnimal pet : petList){
            System.out.println("Pet: "+pet);
        }
    }


    public static void main(String[] args) {
        Kennel ken1 = new Kennel();
        ken1.run();
        ken1.list();
        System.out.println("we are done");
    }

}

