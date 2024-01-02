package Poly;

public class Rectangle extends Shape{
	void draw()
	{
	System.out.println("Drawing Rectangle Shape");	
	}
	double calculateArea()
	{
	return 4.0*5.0;	
	}
	double calculatePerimeter() {
		return 2*(5.0+4.0);
	}
}
