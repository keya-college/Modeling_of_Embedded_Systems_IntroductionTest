package Pet_Project;
class Cat extends Animal {
    public Cat(String name, House house) {
        super(name, house);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " says: Meow!");
    }
}
