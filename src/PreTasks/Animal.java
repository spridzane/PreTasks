package PreTasks;

public class Animal {
    private String name;

    //constructor
    public Animal(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    public void speak(){
        System.out.println("My name is: " + name);
    }
}
