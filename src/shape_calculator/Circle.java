package shape_calculator;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double Perimeter() {
		return Math.PI * radius * 2;
	}
	
	public double Area() {
		return Math.PI * radius * radius; 
	}
	
	public void Draw()
    {
        System.out.println("Drawing a circle");
    }
}
