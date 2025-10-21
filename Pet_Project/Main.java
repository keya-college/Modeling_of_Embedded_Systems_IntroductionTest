package Pet_Project;
public class Main {
    public static void main(String[] args) {
        House house = new House("123 Street");
        Dog d1 = new Dog("Buddy", house);
        Cat c1 = new Cat("Luna", house);

        house.addPet(d1);
        house.addPet(c1);

        d1.makeNoise();
        c1.makeNoise();

        house.makeAllPetsNoise();
    }
}
