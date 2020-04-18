package PreTasks;
/** Write an application that calculates the area and perimeter of a rectangle and displays them to the user.
 Use inheritance and polymorphism.
 Shape is a class that represents generic geometric shapes
 Rectangle class inherits all the non-private data members and methods of the Shape class.
 ShapeApp uses the instantiable classes Rectangle (a subclass) and the Shape (a superclass)
 to demonstrate the concepts of inheritance and polymorphism in Java.
 */

public class Shape {
    //instance variables
    private String shapeName;
    protected double area;

    //constructor with 1 param
    public Shape(String name){
        this.shapeName = name;
    }

    //declare a processing method
    public void computeArea(){
        area = 0;
    }

    //to retrieve the value of area
    public double getArea() {
        return area;
    }

    public String getShapeName() {
        return shapeName;
    }

    //description
    public void printDescription (){
        System.out.println("Generic geometric shape " + getShapeName());
    }

    //declare a method to display the properties/state of instance variables of this class
    public void displayMe(){
        System.out.println("_________________");
        System.out.println(shapeName);
        System.out.println(area);
    }

}//end class
