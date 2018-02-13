import java.util.* ;

public class Main
{
    public static void main(String args[])

    {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter length of rectangle (positive integer): ");
        double lengthRectangle = scnr.nextDouble();
        System.out.print("Enter width of rectangle (positive integer): ");
        double widthRectangle = scnr.nextDouble();
        System.out.print("Now enter the radius of the circle (positive integer): ");
        double radiusCircle = scnr.nextDouble();
        System.out.print("Enter side A of triangle (positive integer): ");
        double sideA = scnr.nextDouble();
        System.out.print("Enter side B of triangle (positive integer): ");
        double sideB = scnr.nextDouble();
        System.out.print("Enter side C of triangle (positive integer): ");
        double sideC = scnr.nextDouble();
        double s = (sideA + sideB + sideC) / 2;


        System.out.println("\nArea of rectangle: " + lengthRectangle*widthRectangle);
        System.out.println("Area of circle: " + 3.14*radiusCircle*radiusCircle);
        System.out.println("Perimeter of rectangle: " + 2*(lengthRectangle+widthRectangle));
        System.out.println("Circumference of circle: " + 2*3.14*radiusCircle);
        System.out.println("Area of triangle: " + Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC)));
        System.out.println("Perimeter of triangle: " + (sideA + sideB + sideC));


        System.out.print("\nEnter the radius of the sphere: ");
        double radiusSphere = scnr.nextDouble();
        System.out.print("Enter the diameter of the rectangular prism: ");
        double diameterPrism = scnr.nextDouble();
        System.out.print("Enter the height of the rectangular prism: ");
        double heightPrism = scnr.nextDouble();
        System.out.print("Enter the width of the rectangular prism: ");
        double widthPrism = scnr.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double heightCylinder = scnr.nextDouble();
        System.out.print("Enter the radius of the cylinder: ");
        double radiusCylinder = scnr.nextDouble();


        System.out.println("\nThe surface area of the sphere is: " + (4*3.14*radiusSphere*radiusSphere));
        System.out.println("The volume of the sphere is: " + ((4*3.14*radiusSphere*radiusSphere*radiusSphere)/3));
        System.out.println("The surface area of the rectangular prism is: " +  (2*((heightPrism*diameterPrism)+(heightPrism*widthPrism)+(diameterPrism*widthPrism))));
        System.out.println("The volume of the rectangular prism is: " + (heightPrism*widthPrism*diameterPrism));
        System.out.println("The surface area of the cylinder is: " + ((2*3.14*radiusCylinder*heightCylinder)+(2*3.14*radiusCylinder*radiusCylinder)) );
        System.out.println("The volume of the cylinder is: " + (3.14*radiusCylinder*radiusCylinder*heightCylinder));


    }
}