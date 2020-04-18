package PreTask3;

public class Alien implements HumanInterface {

    private int age;

    public Alien(int age) {
        this.age = age;
    }

    @Override
    public void talk() {
        System.out.println("Im a liitle Alien, I can talk!");
    }

    @Override
    public void walk() {
        System.out.println("Im a liitle Alien, I can walk!");
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
