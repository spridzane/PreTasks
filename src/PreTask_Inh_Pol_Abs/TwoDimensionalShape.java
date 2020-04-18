package PreTask_Inh_Pol_Abs;
/** Lab: Inheritance. Polymorphism. Abstract Classes.:
 Problem 2
 Task1: Extend the example shown during class, to create an
 inheritance hierarchy for geometrical shapes as depicted on
 the next slide. There is a superclass named AbsShape, the
 superclass of all geometrical shapes. There are two other
 classes that generically represent all the 2D and 3D
 geometrical shapes respectively. For the 2D geometrical
 shapes implement the classes Circle and Triangle. For the 3D
 geometrical shapes implement the classes Cube and Sphere.
 The 2D geometrical shapes contain methods to compute their
 area and perimeter. The 3D geometrical shapes contain
 methods to compute their surface area and volume.
 Use inheritance and abstract classes.
 TwoDimensionalShape
 -- TwoDimensionalShape is called an abstract class, or more specifically an abstract superclass.
 -- TwoDimensionalShape is also a subclass because it inherits from AbsShape superclass.
 */
public abstract class TwoDimensionalShape extends AbsShape {
    //declare data members
    protected double perimeter;

    //declare constructor
    public TwoDimensionalShape(String shapeName) {
        super(shapeName);//calling the constructor from superclass AbsShape
        description = "2D shape: "; //instance variable description which is available in superclass AbsShape
    }

    //declare getter for perimeter
    public double getPerimeter() {
        return perimeter;
    }

    //declare abstract method
    public abstract void computePerimeter();

}//end class
