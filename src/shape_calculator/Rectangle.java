package shape_calculator;

public class Rectangle extends Shape {
	private double height, width;
	
	public Rectangle(double x,double y) {
		this.height = x;
		this.width = y;
	}
	
	public double Perimeter() {
		return (height + width) * 2;
	}
	
	public double Area() {
		return height * width; 
	}
	
	public void Draw()
    {
        System.out.println("Drawing a rectangle");
    }
	
}
