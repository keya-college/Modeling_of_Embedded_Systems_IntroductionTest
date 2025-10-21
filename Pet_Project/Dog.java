package Pet_Project;
class Dog extends Animal {
    public Dog(String name, House house) {
        super(name, house);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " says: Woof Woof!");
    }
}
