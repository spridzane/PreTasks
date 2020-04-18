package PreTasks;

public class Cat extends Animal{

    private String type;

    public Cat(String name, String type) {
        super(name);
        this.type = type;
    }

    public String getName(){
        return super.getName();
    }

    public void speak(){
        super.speak();
        System.out.println("I say MIAW...");
    }


}
