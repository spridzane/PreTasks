package PreTask3;

public class HumanApp {
    public static void main(String[] args) {

        Person bob = new Person(23);
        System.out.println(bob.getAge());
        bob.talk();
        bob.walk();

        Alien al = new Alien(3232);
        System.out.println(al.getAge());
        al.talk();
        al.walk();
    }
}
