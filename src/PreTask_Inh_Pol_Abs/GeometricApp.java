package PreTask_Inh_Pol_Abs;
/** Lab: Inheritance. Polymorphism. Abstract
 Problem 2
 Task2: Develop an application named GeometricApp to create the geometric shapes previously defined. The application should
 create objects of each geometric type and display the properties (e.g. area, perimeter, volume) of each geometric shape.

 superclass type and creating objects of the subclass type, and then calling specific methods on the objects. (follow the example shown in class – available also in the lecture slides)
 e.g. AbsShape s1, s2;
 s1 = new Triangle();
 s2 = new Circle();
 */
public class GeometricApp {
    public static void main(String[] args) {
        //declare a variable of type AbsShape
        AbsShape absShape; //can't create an object from abstract class

        //Task2:
        System.out.println("=========Inheritance=========");
        Circle myCircle = new Circle("A Circle", 3);
        Triangle myTriangle = new Triangle("A Triangle",3,4,5);
        Cube myCube = new Cube("A Cube",4);
        Sphere mySphere = new Sphere("A Sphere",4);

        //processing
        myCircle.computeArea();
        myCircle.computePerimeter();

        myTriangle.computeArea();
        myTriangle.computePerimeter();

        myCube.computeArea();
        myCube.computeVolume();

        mySphere.computeArea();
        mySphere.computeVolume();

        //output
        String desc = myCircle.getDescription();
        String name = myCircle.getShapeName();
        double value = myCircle.getArea();

        System.out.println(desc + ": " + name + ": area: " + value);
        value = myCircle.getPerimeter();
        System.out.println(desc + ": " + name + ": perimeter: " + value);

        desc = myTriangle.getDescription();
        name = myTriangle.getShapeName();
        value = myTriangle.getArea();

        System.out.println(desc + ": " + name + ": area: " + value);
        value = myTriangle.getPerimeter();
        System.out.println(desc + ": " + name + ": perimeter: " + value);

        desc = myCube.getDescription();
        name = myCube.getShapeName();
        value = myCube.getArea();

        System.out.println(desc + ": " + name + ": area: " + value);
        value = myCube.getVolume();
        System.out.println(desc + ": " + name + ": volume: " + value);

        desc = mySphere.getDescription();
        name = mySphere.getShapeName();
        value = mySphere.getArea();

        System.out.println(desc + ": " + name + ": area: " + value);
        value = mySphere.getVolume();
        System.out.println(desc + ": " + name + ": volume: " + value);

        //Task3:
        System.out.println();
        System.out.println("=======polymorphism========");

        AbsShape absShape1, absShape2, absShape3, absShape4;
        absShape1 = new Circle("one more circle:", 9);
        absShape2 = new Triangle("one more triangle:", 8,7,6);
        absShape3 = new Cube("one more cube:",6);
        absShape4 = new Sphere("one more sphere",2.5);

        //processing
        absShape1.computeArea();
        absShape2.computeArea();
        absShape3.computeArea();
        absShape4.computeArea();

        //output
        System.out.println(absShape1.getDescription() + ": " + absShape1.getShapeName() + ": area: " + absShape1.getArea());
        System.out.println(absShape2.getDescription() + ": " + absShape2.getShapeName() + ": area: " + absShape2.getArea());
        System.out.println(absShape3.getDescription() + ": " + absShape3.getShapeName() + ": area: " + absShape3.getArea());
        System.out.println(absShape4.getDescription() + ": " + absShape4.getShapeName() + ": area: " + absShape4.getArea());

        System.out.println();
        System.out.println("=======the instanceof and downcasting========");

        //downcasting absShape1 from absShape to Circle
        if (absShape1 instanceof Circle){
            Circle c = (Circle)absShape1;
            c.computePerimeter();
            System.out.println(c.getDescription() + ": " + c.getShapeName() + ": perimeter: " + c.getPerimeter());
        }

        if (absShape2 instanceof Triangle){
            Triangle t = (Triangle) absShape2;
            t.computePerimeter();
            System.out.println(t.getDescription() + ": " + t.getShapeName() + ": perimeter: " + t.getPerimeter());
        }

        if (absShape3 instanceof Cube){
            Cube c = (Cube) absShape3;
            c.computeVolume();
            System.out.println(c.getDescription() + ": " + c.getShapeName() + ": volume: " + c.getVolume());
        }
        if (absShape4 instanceof Sphere){
            Sphere s = (Sphere) absShape4;
            s.computeVolume();
            System.out.println(s.getDescription() + ": " + s.getShapeName() + ": volume: " + s.getVolume());
        }

        System.out.println();
        System.out.println("=======polymorphism========");
        AbsShape shapes[];

        shapes = new AbsShape[4];

        shapes [0] = new Circle("one more circle in []:", 19);
        shapes [1]= new Triangle("one more triangle in []:", 18,17,16);
        shapes [2] = new Cube("one more cube in []:",16);
        shapes [3]= new Sphere("one more sphere in []:",2.5);

        //processing
        for(int i= 0; i < shapes.length; i++){
            AbsShape s = shapes[i];
            s.computeArea();
        }
        System.out.println();
        //output
        for(int i = 0; i < shapes.length; i++){
            AbsShape s = shapes[i];
            System.out.println(s.getDescription() + ": " + s.getShapeName() + ": area: " + s.getArea());
        }

        System.out.println();
        System.out.println("==========instanceof and downcasting=======");
        // the instanceof keyword allows to check at runtime (i.e. during program execution)
        // if an objects is of a specified type (e.g. Circle, Triangle, Cube or Sphere in our case).
        // why is the instanceof keyword important? lets say,
        // AbsShape abstract superclass contains neither the computePerimeter() method
        // nor the computeVolume() method. therefore,
        // we cannot directly invoke the methods on object stored in the shapes array of AbsShape type
        // remove the next comment to u will see that u cannot directly call the getPerimeter()
        // on the first element of the array (because it has been declared as AbsShape),
        // othwerwise we would get a compilation error.
        //System.out.println(shapes[0].getDescription() + ": " + shapes[0].getShapeName()  + ": perimeter: " + shapes[0].getPerimeter());

        // processing and output
        // traverse the array: in each iteration compute and display either the perimeter for the 2D geometric shapes
        // or the volume for the 3D geometric shapes

        for(int i = 0; i < shapes.length; i++){
            AbsShape s = shapes[i];
            if(s instanceof Circle){
                Circle c = (Circle) s;
                //processing
                c.computePerimeter();
                System.out.println(c.getDescription() + ": " + c.getShapeName() + ": perimeter: " + c.getPerimeter());
            }else if(s instanceof Triangle){
                Triangle t = (Triangle) s;
                t.computePerimeter();
                System.out.println(t.getDescription() + ": " + t.getShapeName() + ": perimeter: " + t.getPerimeter());
            }else if(s instanceof Cube){
                Cube c = (Cube) s;
                c.computeVolume();
                System.out.println(c.getDescription() + ": " + c.getShapeName() + ": volume: " + c.getVolume());
            }else if(s instanceof Sphere){
                Sphere aSphere = (Sphere) s;
                aSphere.computeVolume();
                System.out.println(aSphere.getDescription() + ": " + aSphere.getShapeName() + ": volume: " + aSphere.getVolume());
            }
        }

    }//end main
}//end class
