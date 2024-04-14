package shape_calculator;import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.print("Enter the height of the rectangle: ");
                double height = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                shape = new Rectangle(height, width);
                break;
            case 2:
                System.out.print("Enter the length of side 1 of the triangle: ");
                double side1 = scanner.nextDouble();
                System.out.print("Enter the length of side 2 of the triangle: ");
                double side2 = scanner.nextDouble();
                System.out.print("Enter the length of side 3 of the triangle: ");
                double side3 = scanner.nextDouble();
                shape = new Triangle(side1, side2, side3);
                break;
            case 3:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        if (shape != null) {
            System.out.println("Choose what to calculate:");
            System.out.println("1. Area");
            System.out.println("2. Perimeter");
            System.out.print("Enter your choice: ");
            int calculationChoice = scanner.nextInt();

            double result = 0;

            
            switch (calculationChoice) {
                case 1:
                    result = shape.Area();
                    break;
                case 2:
                    result = shape.Perimeter();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}

