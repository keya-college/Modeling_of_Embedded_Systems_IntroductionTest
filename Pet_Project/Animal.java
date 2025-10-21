package Pet_Project;
abstract class Animal {
    protected String name;
    protected House house;

    public Animal(String name, House house) {
        this.name = name;
        this.house = house;
    }

    public abstract void makeNoise();
}
