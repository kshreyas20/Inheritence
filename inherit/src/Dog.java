public class Dog extends PetAnimal {


    public Dog(){

    }
    public void bark (){

        System.out.println("Bark");
    }

    public static void main(String[] args) {

        PetAnimal pet = new PetAnimal();
        pet.walk();


        Dog dog = new Dog();
        dog.bark();
        dog.walk();
        dog.setName("Fido");
        System.out.println(dog.getName());
    }

}
