package Pet_Project;
import java.util.ArrayList;
import java.util.List;

class House {
    private String address;
    private List<Animal> pets = new ArrayList<>();

    public House(String address) {
        this.address = address;
    }

    public void addPet(Animal pet) {
        pets.add(pet);
    }

    public void makeAllPetsNoise() {
        for (Animal pet : pets) {
            pet.makeNoise();
        }
    }
}
