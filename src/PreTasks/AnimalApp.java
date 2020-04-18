package PreTasks;

public class AnimalApp {
    public static void main(String[] args) {

        Animal a = new Animal("Fido");
        Cat c = new Cat("Felix", "Persian");

        System.out.println("The animal is called " + a.getName());
        System.out.println("The cat is called " + c.getName());
        a.speak();
        c.speak();
    }
}
