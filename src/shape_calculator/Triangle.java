package shape_calculator;

public class Triangle extends Shape {

private double side1, side2, side3 ;
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double Perimeter() {
		return side1 + side2 + side3;
	}
	
	public double Area() {
		return side1 * side2 * 0.5 ;
	}
	
	public void Draw()
    {
        System.out.println("Drawing a triangle");
    }
	
}
