package PreTasks2;

public abstract class Car {

    private String model;
    protected short speed;
    private float weight;
    private String color;
    private boolean isWorking;

    public Car() {
        System.out.println("We just created the constructor");
    }

    public Car(String model, short speed, float weight, String color, boolean isWorking) {
        this.model = model;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.isWorking = isWorking;
    }

    public void displayMe(){
        System.out.println("Car model is: " +
                this.model + " with the max speed " +
                this.speed + "with weight " +
                this.weight + " . Cars Color: " +
                this.color + " , auto parking is working: " +
                this.isWorking);
    }

    abstract void startEngine();

}
