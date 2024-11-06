package Pet;

public class PetZoo {

    public static void main(String[] args) {

        Pet dog = new Pet("Fido", "dog");
        Pet cat = new Pet("Missan","cat");
        Pet rabbit = new Pet("Koko", "rabbit");

        //Använd denna metoden ifrån klassen PetZoo på dina tre nyligen skapade objekt.

        dog.printName();
        cat.printName();
        rabbit.printName();
    }
}
