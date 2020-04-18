package PreTasks2;

public class BMW extends Car{
    private boolean isMPerformance = false;

    @Override
    void startEngine() {
        System.out.println("You can start the engine with mobile app.");
    }

    public BMW(String model, short speed, float weight, String color, boolean isWorking, boolean isMPerformance) {
        super(model, speed, weight, color, isWorking);
        this.isMPerformance = isMPerformance;
    }

    public void printAll(){
        super.displayMe();
        System.out.println("Car is with M Performance " + isMPerformance);
    }
}
