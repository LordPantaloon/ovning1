package Pet;

public class Pet {

    private String name; //Attribut
    private String type;

    public Pet(String petName, String petType) { //Konstruktor
        name = petName;
        type = petType;
    }

    //Skapa en ny metod i klassen Pet som skriver ut attributet name.
    public void printName() {
        System.out.println("The name of the pet is: " + name + ". " + name + " is a " + type + ".");

    }
}

