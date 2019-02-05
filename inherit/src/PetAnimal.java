public class PetAnimal {



    private int age = 1;
    private String name = "";

    private int id;
    private static int idCounter = 0;

    static {
        idCounter = 1000;
        System.out.println("ID counter is "+idCounter);
    }

    /*
     * Constructor
     */
    public PetAnimal(){
        name = "unknown" ;
        id = idCounter++;
    }

    public PetAnimal(String name){
        setName(name);
        id = idCounter++;
    }

    public int getId() {
        return id;
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
