package PreTasks2;

public class CarApp {
    public static void main(String[] args) {

        BMW m5 = new BMW("M5", (short) 300, 2500.23f,"Blue", true, true);
        //BMW m3 = new BMW("M3",);
        m5.printAll();
        m5.startEngine();
    }//end main
}//end class
