package Poly;

public class Square extends Shape {
	void draw()
	{
	System.out.println("Drawing Square Shape");	
	}
	double calculateArea()
	{
	return 5.0*5.0;	
	}
	double calculatePerimeter() {
		return 4*(5.0);
	}
}
