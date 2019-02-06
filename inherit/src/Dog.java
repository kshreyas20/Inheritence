public class Dog extends PetAnimal {


    public Dog(){

    }

    public Dog (String name){
        setName(name);
    }

    public void bark (){

        System.out.println("Bark");
    }

    public static void main(String[] args) {

        PetAnimal pet = new PetAnimal();
        pet.walk();
        System.out.println("My pet is named"+pet.getName()+" - ID:"+pet.getId());

        Dog dog = new Dog();
        dog.bark();
        dog.walk();
        dog.setName("Fido");
        System.out.println("My dog is named" + dog.getName()+" - ID:" + dog.getId());


        double d = Double.valueOf("0.123");

        char c = '5';
        if(Character.isDigit(c)){
            System.out.println("we have a digit: "+c);
        }
        System.out.println(d);

    }

}
