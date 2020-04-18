package PreTasks;

public class ShapeApp {
    public static void main(String[] args) {

        System.out.println(":::::::::::::::inheritance:::::::::::::::");

        Shape shape = new Shape("Generic shape");

        Rectangle rectangle = new Rectangle("Generic Rectangle", 5, 8);

        //processing
        shape.computeArea();
        rectangle.computeArea();

        //output
        double area = rectangle.getArea(); //inheritance
        System.out.println("rectangle area: " + area);
        System.out.println();

        System.out.println(":::::::::::::::polymorphism:::::::::::::::");

        //declare two variables of super-class type
        Shape s1, s2;
        s1 = new Shape("One more Generic Shape");
        s2 = new Rectangle("One more Generic Shape", 10, 20);

        //processing
        s1.computeArea(); //calls the computeArea() defined in the Shape class
        s2.computeArea(); //calls the computeArea() defined in the Rectangle class

        //output
        area = s1.getArea();
        System.out.println("THE NEW AREA OF SHAPE: " + area);

        area = s2.getArea();
        System.out.println("THE NEW AREA OF RECTANGLE: " + area);
        System.out.println();

        System.out.println(":::::::::::::::overriding methods:::::::::::::::");
        s1.printDescription();
        s2.printDescription();

        System.out.println(":::::::::::::::instanceof:::::::::::::::");
        if(s2 instanceof Rectangle){
            //downcast s2 from Shape s2 to type of Rectangle
            //we need to downcast because of the method getWidth() and getHeight()
            Rectangle r2 = (Rectangle) s2; //downcast
            double width = r2.getWidth();
            double height = r2.getHeight();
            System.out.println("Width and height: " + width + ", " + height);
        }

    }//end main
}//end class
