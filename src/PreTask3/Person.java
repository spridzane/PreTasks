package PreTask3;

public class Person implements HumanInterface {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public void talk() {
        System.out.println("Hello, I can Talk!");
    }

    @Override
    public void walk() {
        System.out.println("Hello, I can Walk!");
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
