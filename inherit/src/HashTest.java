import java.util.HashMap;

public class HashTest {

    private HashMap<String,PetAnimal> myMap = new HashMap<String, PetAnimal>();

    public HashTest() {
        myMap.put("Fido",new Dog("Fido"));

        Dog dg1 = new Dog("Thor");
        myMap.put(dg1.getName(),dg1);

        Dog dg2 = new Dog("Fenaj");
        myMap.put(dg2.getName(),dg2);

        if(myMap.containsKey("Fenaj")){
            System.out.println("We found Fenja: "+myMap.get("Fenaj"));
        }
        list();
    }
    private void list(){
        for(PetAnimal pet: myMap.values()){
            System.out.println("Found pet is:"+pet.getName());
        }
    }

    public static void main(String[] args) {
        HashTest ht = new HashTest();

    }
}
