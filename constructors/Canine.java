package constructors;
import java.util.Scanner;
class Dog{
    private String name;
    private String breed;
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
}
public class Canine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Charlie", "Bulldog");

        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");

        System.out.println("\nSet the new Breed of dog1 and new name of dog2:");
        String breed = sc.nextLine();
        String name = sc.nextLine();

        dog1.setBreed(breed);
        dog2.setName(name);

        System.out.println(dog1.getName() + " is now a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is now a " + dog2.getBreed() + ".");
    }
}
