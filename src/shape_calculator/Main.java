package shape_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to choose a shape
        System.out.println("Choose a shape: ");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

       
        Shape shape = null;
        double Area = 0;
        double Perimeter = 0;
        switch (choice) {
            case 1: 
                System.out.print("Enter height of the rectangle: ");
                double rectLength = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double rectWidth = scanner.nextDouble();
                shape = new Rectangle(rectLength, rectWidth);
                Area = shape.Area();
                Perimeter = shape.Perimeter(); 
                break;
            case 2: 
                System.out.print("Enter side1 of the triangle: ");
                double triSide1 = scanner.nextDouble();
                System.out.print("Enter side2 of the triangle: ");
                double triSide2 = scanner.nextDouble();
                System.out.print("Enter side3 of the triangle: ");
                double triSide3 = scanner.nextDouble();
                shape = new Triangle(triSide1, triSide2, triSide3);
                Area = shape.Area();
                Perimeter = shape.Perimeter(); 
                break;
            case 3: 
                System.out.print("Enter radius of the circle: ");
                double circleRadius = scanner.nextDouble();
                shape = new Circle(circleRadius);
                Area = shape.Area();
                Perimeter = shape.Perimeter(); 
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        if (shape != null) {
            if (Area > 0 && Perimeter > 0) {
                System.out.println("Area: " + Area + "\n" + "Perimeter: " + Perimeter );
            } else {
                System.out.println("Enter Positive Values");
            }
            shape.Draw();
        }

        scanner.close();
    }
}
