public class PetAnimal {



    private int age = 1;
    private String name = "";

    /*
     * Constructor
     */
    public PetAnimal(){
        name = "unknown" ;
    }

    public PetAnimal(String name){
        setName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) age = 0; //Guard against negative value
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk () {
        System.out.println("We are walking");
    }
}
