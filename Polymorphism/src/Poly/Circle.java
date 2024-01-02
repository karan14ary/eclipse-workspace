package Poly;

public class Circle extends Shape {
	void draw()
	{
	System.out.println("Drawing Circle Shape");	
	}
	double calculateArea()
	{
	return Math.PI*4.0*4.0;	
	}
	double calculatePerimeter() {
		return 2*(Math.PI*4.0);
	}
}
