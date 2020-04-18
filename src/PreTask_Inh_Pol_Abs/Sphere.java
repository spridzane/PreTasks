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
 Sphere
 -- Sphere is a subclass, ThreeDimensionalShape is its direct superclass and AbsShape is its indirect superclass
 */
public class Sphere extends ThreeDimensionalShape {
    //declare data members
    private double radius;
    private final double PI = 3.1416;

    public Sphere(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }

    @Override
    public void computeVolume() {
        volume = 4/3 * (PI * radius * radius * radius);
    }

    @Override
    public void computeArea() {
        area = 4 * PI * radius * radius;
    }
}
