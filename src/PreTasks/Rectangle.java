package PreTasks;

public class Rectangle extends Shape {

    //declare instance variables
    private double width;
    private double height;

    //constructor
    public Rectangle(String name, double width, double height) {
        super(name); //super() calls constructor of the super-class Shape
        this.width = width;
        this.height = height;
    }

    //the overriding method has the same name, data type from super-class
    @Override
    public void computeArea() {
        //the method specializes the area computation with a rectangles area computation
        area = width * height;
    }

    @Override
    public void printDescription() {
        System.out.println("a rectangle: ");
        String name = getShapeName();//calling from shape class
        System.out.println(name);
    }

    @Override //the overriding method, reuses the implementation from the super-class Shape
    public void displayMe() {
        super.displayMe(); //by calling the method with the same name displayMe() from the Shape class
        //the super keyword shows to call the method displayMe() from super-class
        System.out.println("width: " + width);
        System.out.println("height: " + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


}
